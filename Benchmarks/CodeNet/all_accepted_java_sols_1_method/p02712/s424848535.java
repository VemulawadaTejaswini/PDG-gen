import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      long sum = 0;
      int num = Integer.parseInt(input.nextLine());    	

      for (int i = 1; i <= num; i++) {
          if (i % 3 != 0 && i % 5 != 0) {
          	sum += i;
          }
      }
      
      System.out.println(sum);
    }
}