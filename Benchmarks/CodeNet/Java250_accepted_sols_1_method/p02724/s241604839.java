
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		ans += N/500*1000;
		N -= N/500*500;
		ans += N/5*5;
		System.out.println(ans);
	}

}
