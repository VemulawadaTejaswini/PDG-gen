import java.util.Scanner;

class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int work;
      if(c < a) {
         work = a;
         a = c;
         c = work;
      }
      if(c < b) {
         work = b;
         b = c;
         c = work;
      }
      if(b < a) {
         work = a;
         a = b;
         b = work;
      }
      System.out.println(a + " " + b + " " + c);
   }
}