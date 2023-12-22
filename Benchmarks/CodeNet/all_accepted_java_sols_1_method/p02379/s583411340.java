import java.util.Scanner;

class Main {
	public static void main(String args[]){	

	Scanner scan = new Scanner(System.in);

	double x1 = scan.nextDouble();
	double y1 = scan.nextDouble();
	double x2 = scan.nextDouble();
	double y2 = scan.nextDouble();
	
	
	
	double ans = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

	System.out.println(ans);
	}
}