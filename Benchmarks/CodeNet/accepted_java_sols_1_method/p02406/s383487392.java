import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    for(i=1; i<=n; i++){
      if(i % 3 == 0){
        out.printf(" "+i);
        continue;
      }

      int x = i;
      do{
        if(x % 10 == 3){
          out.printf(" "+i);
          break;
        }
        x /= 10;
      }while(x != 0);
    }
    out.println();
  }
}
