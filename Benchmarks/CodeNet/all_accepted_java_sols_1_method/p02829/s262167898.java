import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();

      int a = 1;
      int b = 2;
      int c = 3;

      if (A==a) {
        a = 0;
      } else if (A==b) {
        b = 0;
      } else if (A==c) {
        c = 0;
      }
      if (B==a) {
        a = 0;
      } else if (B==b) {
        b = 0;
      } else if (B==c) {
        c = 0;
      }
      System.out.println(a+b+c);

    }      
}