import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    int patterns = 1;
    for(int i=0; i<k; i++){
      patterns *= 3;
    }
    int[][][] choice = new int[patterns][k+1][3];

    boolean flag = false;

    for(int i=0; i<patterns; i++){
      int copy = i;
      choice[i][0][0] = a;
      choice[i][0][1] = b;
      choice[i][0][2] = c;

      for(int j=1; j<k+1; j++){
        int amari = copy % 3;

        choice[i][j][0] = choice[i][j-1][0];
        choice[i][j][1] = choice[i][j-1][1];
        choice[i][j][2] = choice[i][j-1][2];

        choice[i][j][amari] = (choice[i][j-1][amari] << 1);

        if(choice[i][j][0] < choice[i][j][1] && choice[i][j][1] < choice[i][j][2]){
          flag = true;
          break;
        }
  
        copy = (copy - amari) / 3;
      }
    }

    if(flag){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}