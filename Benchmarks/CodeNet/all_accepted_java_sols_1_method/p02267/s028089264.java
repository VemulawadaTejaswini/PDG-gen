import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] s = new int[n];
		
		for (int i = 0; i < n; i ++) {
			s[i]  = scanner.nextInt();
		}
		
		int q = scanner.nextInt();
		int c = 0;

		for (int i = 0; i < q; i ++) {
			int ti = scanner.nextInt();
			for (int j = 0; j < n; j ++) {
				if (ti == s[j]) {
					c ++;
					break;
				}
			}
		}
		
		scanner.close();
		
		System.out.println(c);
	}
} 

