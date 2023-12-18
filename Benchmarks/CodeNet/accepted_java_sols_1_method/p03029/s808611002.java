import java.util.*;
import java.lang.Integer;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int P = sc.nextInt();
      
      P = P + A * 3;
      int ApplePie = P / 2;
      
      System.out.println(ApplePie);
    }
}
