import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] numYakusu = new int[n+1];
    Arrays.fill(numYakusu, 0);

    for(int i = 1; i<n+1; i++){
      for(int j=1; j<n+1; j++){
        if(i * j < n + 1){
          numYakusu[i * j]++;
        }else{
          break;
        }
      }
    }

    long total = 0;
    for(int i=1; i<n+1; i++){
      total += i * numYakusu[i];
    }

    System.out.println(total);

  }
}