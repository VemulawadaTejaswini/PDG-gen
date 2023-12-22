import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		double R = stdIn.nextDouble();
		double ans = 0;

		ans = R * Math.PI * 2;
		System.out.println(ans);
		stdIn.close();
	}
}