//2019/3/12
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double x = 0;

		String u = "";

		double ans = 0;

		for(int i=0;i<N;i++) {

			x = sc.nextDouble();

			u = sc.next();

			if(u.equals("JPY")) ans += x;

			else if(u.equals("BTC")) ans += (x*380000.0);
		}

		System.out.println(ans);
	}

}
