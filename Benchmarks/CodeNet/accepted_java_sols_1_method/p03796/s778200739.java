import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double power = 1;
		for(int i=1; i<=n; i++) {
			power= (power*i)%(Math.pow(10, 9)+7);
		}
		System.out.println((int)power);
	}

}