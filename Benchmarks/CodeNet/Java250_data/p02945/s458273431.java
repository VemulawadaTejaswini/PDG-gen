import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();


      int sum = a + b;
      int sub = a - b;
      int mul = a * b;
      
      int max = sum;
      if(sub > max) {
    	  max = sub;
      }
      if(mul > max) {
    	  max = mul;
      }
      
      System.out.println(max);

      sc.close();

    }
}
