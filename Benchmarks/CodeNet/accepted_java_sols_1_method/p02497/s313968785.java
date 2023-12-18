import java.util.*;
import static java.lang.System.out;
import static java.lang.Math.*;

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    while(true){
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      if( a == -1 && b == -1 && c == -1 ) break;
      if( a == -1 || b == -1 ) out.println("F");
      else if( a+b >= 80 ) out.println("A");
      else if( a+b >= 65 ) out.println("B");
      else if( a+b >= 50 ) out.println("C");
      else if( a+b >= 30 ) if( c >= 50 ) out.println("C");
                           else out.println("D");
      else out.println("F");
    }
  }
}