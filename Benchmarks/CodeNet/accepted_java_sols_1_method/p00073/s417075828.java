import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double h = scan.nextDouble();
			while(x != 0 && h != 0){
			double s = Math.sqrt(h*h+(x/2)*(x/2));
			System.out.println(x*x+(s*x*0.5)*4);
			x = scan.nextDouble();
			h = scan.nextDouble();
		}
	}
}