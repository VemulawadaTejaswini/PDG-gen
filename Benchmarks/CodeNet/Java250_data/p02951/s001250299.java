import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int C = scan.nextInt();
    int D = 0;
    
    D = B + C - A;
    if(D >= 0){
      System.out.println(D);
    } else {
      System.out.println(0);
    }

  }
}