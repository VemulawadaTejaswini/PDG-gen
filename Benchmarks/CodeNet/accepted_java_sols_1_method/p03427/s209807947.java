import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		char[] N = sc.next().toCharArray();
		int ans = 0;
		int acum = 0;
		for (int i = 0; i < N.length; i++) {
			acum += N[i] -'0';
			ans = Math.max(ans, acum);
			ans = Math.max(ans, acum - 1 + (N.length - i - 1) * 9);
		}
		System.out.println(ans);
	}
}
