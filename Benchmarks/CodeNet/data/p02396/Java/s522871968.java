import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner y = new Scanner(System.in);
      int x;
      x = y.nextInt();
      for(int i = x; i<x.length; i++){
        System.out.printf("%s %d: %d\n", "Case", x, x[i]);
      }
 }
}

