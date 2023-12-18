import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = sc.nextInt();
		int k = sc.nextInt();

		double d = Math.max(a, b);
		if(d > c) {
			d = d * Math.pow(2, k);
		}else {
			c = c * Math.pow(2, k);
		}

		System.out.println((int)Math.min(a,b) + (int)d + (int)c);


	}

}
