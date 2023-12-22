import java.util.Scanner;

class Main{
   public static void main(String args[]) {
      Scanner stdIn = new Scanner(System.in);
      int n = stdIn.nextInt();
      int sum = 1;
      for(int i = 0; i < 3; i++){
         sum *= n;
      }
      System.out.println(sum);
   }
}