import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		String ans;
		if( x < y) {
			ans = "a < b";
		} else if( x > y) {
			ans = "a > b";
		} else {
			ans = "a == b";
		}
		stdIn.close();
		System.out.println(ans);

	}

}

