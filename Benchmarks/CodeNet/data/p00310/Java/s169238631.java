import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] input = sc.nextLine().split(" ");
      int sum = 0;
      for(int i = 0; i < 3; i ++) {
         sum += Integer.parseInt(input[i]);
      }
      System.out.println(sum);
   }
}
