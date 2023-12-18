import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] s = new int[N];
		int[] t = new int[N];
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
			if(s[i] % 10 != 0) {
				t[i] = s[i];
			}
		}
		
		Arrays.sort(t);
		
		if(sum % 10 != 0) {
			System.out.println(sum);
		} else {
			for(int i = 0; i < N; i++) {
				if(t[i] > 0) {
					System.out.println(sum - t[i]);
					return;
				}
			}
			System.out.println(0);
		}
	}
}
