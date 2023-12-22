import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]s = new int[N];
		for(int i = 0; i < N; i++) {
			s[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(s);
		boolean flag = true;
		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(s[i] % 10 != 0) {
				flag = false;
			}
			sum += s[i];
		}
		if(flag) {
			System.out.println(0);
			System.exit(0);
		}
		if(sum % 10 != 0) {
			System.out.println(sum);
			System.exit(0);
		}
		for(int i = 0; i < N; i++) {
			if(s[i] % 10 != 0) {
				System.out.println(sum - s[i]);
				System.exit(0);
			}
		}
	}
}