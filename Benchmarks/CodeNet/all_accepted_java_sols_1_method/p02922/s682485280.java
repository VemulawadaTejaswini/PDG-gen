import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();

		int ans = 1;
		double check = (b % a)/a;


		if(a != b) {
			ans = (int) ((b+a-3)/(a-1));

		}else {
		}
		System.out.println(ans);

	}

}
