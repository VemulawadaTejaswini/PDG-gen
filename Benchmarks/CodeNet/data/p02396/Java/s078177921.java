import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner stdln = new Scanner(System.in);
      x = stdln.nextInt();
      for(int i = 0; i < x.length ; i++){
        System.out.printf("%s %d: %d\n", "Case", x, x[i]);
      }
 }
}

