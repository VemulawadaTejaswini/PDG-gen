import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      while(sc.hasNext()) {
         int d = Integer.parseInt(sc.nextLine());
      
         int area = 0;
         for(int x = d; x < 600; x += d) {
            area += f(x) * d;
         }
      
         System.out.println(area);
      }
   }
   
   public static int f(int x) {
      return x * x;
   }
}
