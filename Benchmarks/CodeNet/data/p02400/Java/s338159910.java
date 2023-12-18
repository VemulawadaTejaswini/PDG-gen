import java.util.Scanner;

class Main{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	double pi = Math.PI;
	int r = scan.nextInt();
//	double area = r *r * pi;
//	double circumference = 2 * pi *r;
//	System.out.print("%.6f %.6f\n",area,circumference);
	System.out.println(pi * pi * r + " " + pi * 2 * r);
	}
}