import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int j = 1;
		int ans = Integer.MAX_VALUE;
		for(int i = 1 ; i < 499500 ; i += j) {
			j++;
			if(a - i == b - (i + j)) {
				ans = Math.min(ans, Math.abs(a - i));
			}
		}
		System.out.println(ans);
	}
}
