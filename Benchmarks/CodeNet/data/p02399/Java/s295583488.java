import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	long  a = scanner.nextInt();
	  	long  b = scanner.nextInt();
	  	long  n = 0;
        double x = 0.f;
        double y = 0.f;
        double z = 0.f;
        
        
		n = a / b;
        System.out.print(n + " ");
		n = a % b;
        System.out.print(n + " ");
        
        x = a/1000000;
        y = a%1000000;
        
        x = x / b;
        y = y / b;
        x *= 1000000;
        z = x + y;
        System.out.printf("%.6f",z);
        
        scanner.close();
  }
}
