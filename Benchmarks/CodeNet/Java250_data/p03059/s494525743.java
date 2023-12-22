
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		double t = in.nextDouble();
		
		int ans = 0;
		for(int i=a; i<=t+0.5; i+=a) {
			ans += b;
		}
		
		System.out.println(ans);
		
		in.close();
	}

}
