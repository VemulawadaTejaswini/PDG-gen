import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
   Scanner S = new Scanner(System.in);
      int a = S.nextInt();
      int b = S.nextInt();
      int d = a / b;
      int r = a % b;
      double f = (double)a / (double)b;
      System.out.printf("%d %d %.5f\n", d, r, f);

}

}

