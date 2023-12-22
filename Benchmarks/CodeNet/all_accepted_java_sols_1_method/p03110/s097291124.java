import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double ret = 0.0;
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			double amount = in.nextDouble();
			boolean btc = in.next().equals("BTC");
			ret += (btc) ? amount * 380000 : amount;
		}
		
		System.out.println(ret);
	}
	
}
