import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    while(true){
      int r = scan.nextInt();
      int c = scan.nextInt();
      if(r == 0 && c == 0) break;
      if((r * c) % 2 == 0) out.println("yes");
      else out.println("no");
    }
  }
}