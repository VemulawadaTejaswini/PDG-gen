import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		double x0 = sc.nextDouble();
		double y0 = sc.nextDouble();
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		double xr = Math.abs(x1 - x0);
		double yr = Math.abs(y1 - y0);

		double ans = Math.sqrt(xr * xr + yr * yr);

		System.out.println(ans);

		sc.close();
	}
}
