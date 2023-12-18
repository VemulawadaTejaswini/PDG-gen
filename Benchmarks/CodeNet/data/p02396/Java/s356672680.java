import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
      Scanner x = new Scanner(System.in);
      for(int i = 0; i<x.length; i++){
        System.out.printf("%c %d: %d\n", 'Case', x, x[i]);
      }
 }
}

