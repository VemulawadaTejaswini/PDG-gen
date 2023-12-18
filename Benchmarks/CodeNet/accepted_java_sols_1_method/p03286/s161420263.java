import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		while(n != 0) {
			if(n % 2 == 0) {
				ans = "0" + ans;
				n /= -2;
			} else {
				ans = "1" + ans;
				n = (n - 1) / (-2);
			}
		}
		if(ans.isEmpty()) {
			System.out.println("0");
		} else {
			System.out.println(ans);
		}
	}
}
