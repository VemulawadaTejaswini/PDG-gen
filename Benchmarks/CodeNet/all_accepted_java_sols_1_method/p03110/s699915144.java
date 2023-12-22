import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double btc = 380000.0;
		int i;
		double x;
		double sum = 0.0;
		for(i = 0; i < n; i++) {
			x = sc.nextDouble();
			if(sc.next().equals("JPY")) {
				sum += x;
			} else {
				sum += x * btc;
			}
		}
		sc = null;
		System.out.println(sum);
	}

}
