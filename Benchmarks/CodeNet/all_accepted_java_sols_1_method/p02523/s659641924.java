import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double x1=scan.nextDouble(),y1=scan.nextDouble(),
				x2=scan.nextDouble(),y2=scan.nextDouble();
		double x,y,z;
		x = x2-x1;
		y = y2-y1;
		z = Math.sqrt(x*x+y*y);
		
		System.out.println(z);
	}
}