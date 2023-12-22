import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		double r = stdIn.nextDouble();
		int ans = 0;
		ans = 3 * (int)Math.pow(r, 2);
		System.out.println(ans);
		stdIn.close();
	}
}