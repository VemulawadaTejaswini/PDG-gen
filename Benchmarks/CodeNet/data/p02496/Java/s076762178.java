import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    boolean cards[][] = new boolean[4][13];
    int n = scan.nextInt();
    String tmp[] = {"S","H","C","D"};
    for(int i=0;i<n;i++){
      String mark = scan.next();
      int no = scan.nextInt();
      for(int j=0;j<4;j++){
        if(mark.equals(tmp[j])){
            cards[j][no-1] = true;
        }
      }
    }
    for(int i=0;i<4;i++){
      for(int j=0;j<13;j++){
        if(!cards[i][j]) out.println(tmp[i] + " " + (j+1));
      }
    }
  }
}