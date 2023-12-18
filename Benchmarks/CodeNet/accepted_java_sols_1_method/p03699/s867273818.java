import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] s = new int[n];
		for(int i = 0; i < n; i++) {
			s[i]  = scan.nextInt();
		}

		Arrays.sort(s);
		
		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += s[i];
		}
		
		for (int i = 0; i < n; i++) {
			if ((ans % 10) != 0) { 
				System.out.println(ans);
				return;
			} else {
				if ((s[i] %  10) != 0) {
					ans = ans - s[i];
					System.out.println(ans);
					return;
				}
			}
		}
		System.out.println(0);
		return;
	}

}