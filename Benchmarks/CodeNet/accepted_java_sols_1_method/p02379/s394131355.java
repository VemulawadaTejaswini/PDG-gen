import java.util.Scanner;

class Main
{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	double x1 = scan.nextDouble();
	double y1 = scan.nextDouble();
	double x2 = scan.nextDouble();
	double y2 = scan.nextDouble();
	
	double x = (x1 - x2) * (x1 - x2);
	double y = (y1 - y2) * (y1 - y2);
	
	double z12 = x + y;
		
	double z = Math.sqrt(z12);
	
	System.out.printf("%.8f\n", z);
	}
}
