 import java.util.*;

 public class Main {
     public static void main(String[] args) {
         new Main().execute();
     }

     public void execute() {
         Scanner sc = new Scanner(System.in);
         int s = sc.nextInt();
         List<Integer> a = new ArrayList<>();
         for (int i = 2; i <= 1000000; i++) {
             a.add(s);
             s = f(s);
             if (a.contains(s)) {
                 System.out.println(i);
                 return;
             }
         }
     }

     private int f(int n) {
         if (n % 2 == 0) {
             return n / 2;
         } else {
             return 3 * n + 1;
         }
     }
 }