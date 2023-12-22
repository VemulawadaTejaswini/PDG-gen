import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		String ans = "No";
		while(n != 0) {
			if(n % 10 == 7) {
				ans = "Yes";
			}
			n = n / 10;
		}
		System.out.println(ans);

		// 後始末
		sca.close();
	}
}