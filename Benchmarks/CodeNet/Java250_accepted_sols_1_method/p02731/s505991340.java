import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		double L = stdIn.nextInt();
		double ans = 0;

		ans = L / 3.0;

		System.out.println(Math.pow(ans, 3));
		stdIn.close();
	}
}
