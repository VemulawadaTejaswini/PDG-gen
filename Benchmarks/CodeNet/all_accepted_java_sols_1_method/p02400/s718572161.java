import java.util.Scanner;
import static java.lang.Math.PI;
class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		double  x = in.nextDouble();	
		System.out.printf("%.5f %.5f",x*x*Math.PI,2*x*Math.PI);
	}
}