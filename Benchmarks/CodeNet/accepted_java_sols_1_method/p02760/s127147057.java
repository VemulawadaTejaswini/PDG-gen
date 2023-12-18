import java.util.*;
public class Main  {
   public static void main(String[] args) throws java.lang.Exception  {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int e = sc.nextInt();
      int f = sc.nextInt();
      int g = sc.nextInt();
      int h = sc.nextInt();
      int i = sc.nextInt();
      
      int n = sc.nextInt();
      
      int array[] = {a, b, c, d, e, f, g, h, i};
      
      int x = 0;
      
      for (int j = 0; j < n; j++) {
         x = sc.nextInt();
         if (a == x) {
            array[0] = 101;
         }else if (b == x) {
            array[1] = 101;
         }else if (c == x) {
            array[2] = 101;
         }else if (d == x) {
            array[3] = 101;
         }else if (e == x) {
            array[4] = 101;
         }else if (f == x) {
            array[5] = 101;
         }else if (g == x) {
            array[6] = 101;
         }else if (h == x) {
            array[7] = 101;
         }else if (i == x) {
            array[8] = 101;      
         }
      }
      
      if (array[0] == array[1] && array[1] == array[2]) {
         System.out.println("Yes");
      } else if (array[3] == array[4] && array[4] == array[5]) {
         System.out.println("Yes");
      } else if (array[6] == array[7] && array[7] == array[8]) {
         System.out.println("Yes");
      } else if (array[0] == array[3] && array[3] == array[6]) {
         System.out.println("Yes");
      } else if (array[1] == array[4] && array[4] == array[7]) {
         System.out.println("Yes");
      } else if (array[2] == array[5] && array[5] == array[8]) {
         System.out.println("Yes");
      } else if (array[0] == array[4] && array[4] == array[8]) {
         System.out.println("Yes");
      } else if (array[2] == array[4] && array[4] == array[6]) {
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }
      
   }  
}
