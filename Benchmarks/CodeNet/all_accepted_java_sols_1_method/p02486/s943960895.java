import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    while(true){
      int n = scan.nextInt();
      int x = scan.nextInt();
      int rec = 0;
      if( n == 0 && x == 0 ) break;
      for(int i=1;i<=n;i++){
        for(int j=i+1;j<=n;j++){
          for(int k=j+1;k<=n;k++){
            if( i + j + k == x) rec++;
          }
        }
      }
      out.println(rec);
    }
  }
}