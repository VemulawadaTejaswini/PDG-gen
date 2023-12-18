
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		double diff = Math.abs((Math.PI*2*m/60)-((Math.PI*m/6/60)+(Math.PI*h/6)));
		if(diff > Math.PI) {
			diff = diff - Math.PI;
		}
		
		double l = Math.sqrt(a*a+b*b-(2*a*b*Math.cos(diff)));
		System.out.println(l);
		
	}

}
