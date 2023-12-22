import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		String s = sc.next();
		if(s.equals("Sunny"))System.out.println("Cloudy");
		else if(s.equals("Cloudy"))System.out.println("Rainy");
		else if(s.equals("Rainy"))System.out.println("Sunny");
	}


	public static void main(String[] args) {
		new Main().doIt();
	}
}
