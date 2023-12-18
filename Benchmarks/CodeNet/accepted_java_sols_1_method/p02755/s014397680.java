import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int x = 1;
      while(true) {
          int A = (int)(x * 0.08 * 10) / 10;
          int B = (int)(x * 0.1 * 10) / 10;
        if(A == a && B == b) {
            System.out.println(x);
            return;
        }
        if(A > a && B > b)
            break;
        x++;
      }
      System.out.println(-1);
  }
}