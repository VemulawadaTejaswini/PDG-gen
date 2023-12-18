import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    while(true){
      int x = scan.nextInt();
      int y = scan.nextInt();
      if(x == 0 && y == 0) break;
      for(int i=0;i<x;i++){
        for(int j=0;j<y;j++){
          if(i == 0 || i == x - 1 || j == 0 || j == y - 1) out.print("#");
          else out.print(".");
        }
        out.println();
      }
      out.println();
    }
  }
}