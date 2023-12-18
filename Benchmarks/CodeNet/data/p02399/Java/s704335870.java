import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	long  a = scanner.nextInt();
	  	long  b = scanner.nextInt();
	  	long  n = 0;
        float x = 0.f;
        float y = 0.f;
        float z = 0.f;
        
        
		n = a / b;
        System.out.print(n + " ");
		n = a % b;
        System.out.print(n + " ");
        
        x = a/10000;
        y = a%10000;
        
        x = x / b;
        y = y / b;
        x *= 10000;
        z = x + y;
        System.out.printf("%.6f",z);
        
        scanner.close();
  }
}
