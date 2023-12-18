import java.util.Scanner;

public class Main{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int r = scan.nextInt();
//	double area = r *r * pi;
//	double circumference = 2 * pi *r;
//	System.out.print("%.6f %.6f\n",area,circumference);
//	System.out.println(MathPI * Math.PI * r + " " + Math.PI * 2 * r);
	System.out.printf("%.6f %.6f\n",(double)r*r*Math.PI ,(double)r*2*Math.PI);
	}
}