import java.util.*;

public class Main{
  public static void main (String args[]){
    Scanner scan = new Scanner(System.in);

    char[][] mozi = new char[1][6];

    for(int i = 0;i<1;i++){
      mozi[i] = scan.next().toCharArray();
    }
    int x = 0;
    if(mozi[0][2] == mozi[0][3]){
      if(mozi[0][4] == mozi[0][5]){
        x = 1;
      }
    }
    if(x == 1){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
