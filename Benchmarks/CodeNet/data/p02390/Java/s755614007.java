import java.util.Scanner;

class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int S = sc.nextInt();
      if (S >= 0 && S < 86400) {
         int h = S / 3600;
         int m = (S % 3600) / 60;
         int s = m % 60;
         System.out.println(h + ":" + m + ":" + s);
      }
   } 
}