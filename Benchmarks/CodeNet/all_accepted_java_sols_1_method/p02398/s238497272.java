import java.util.*;

class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int cnt = 0;
      for (int i = a; i <= b; i++) {
         if (c % i == 0)
            cnt++;
      }
      System.out.printf("%d\n", cnt);
   }
}