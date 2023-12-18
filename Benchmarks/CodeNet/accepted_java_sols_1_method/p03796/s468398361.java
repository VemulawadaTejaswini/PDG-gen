import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		long power = 1;
		long t = (long)(Math.pow(10, 9) + 7);
		
		n = sc.nextInt();
		
		sc.close();
		for(int i = 1; i <= n; ++i) {
			power *= (i % t);
			power %= t;
		}
		
		System.out.println(power);
		
	}

}
