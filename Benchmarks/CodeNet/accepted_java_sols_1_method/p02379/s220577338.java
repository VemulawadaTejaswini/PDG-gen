import java.util.Scanner;
import java.lang.Math;

class Main{
	static public  void main(String args[]){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double distance=0;

		double distance_x = Math.pow((x2-x1),2.0);
		double distance_y = Math.pow((y2-y1),2.0);
		distance = Math.sqrt(distance_x+distance_y); 
		System.out.printf("%.8f\n",distance);
		
	}
}