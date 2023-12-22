import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      int s = scan.nextInt();

      System.out.println(s/3600 + ":" + (s%3600)/60 + ":" + s%60);
   }
}
