import java.util.Scanner;

class Main {
  public static void main(String args[]) {
	  	Scanner scanner = new Scanner(System.in);
	  	//double  r = scanner.nextInt();
	  	double r = scanner.nextDouble();
	  	double  n = 0.f;
        double  p = 3.141592;
        
        
		n = r * r * p;
        System.out.printf("%.6f ",n);
        
		n = 2 * r * p;
        System.out.printf("%.6f",n);
        
        scanner.close();
  }
}
