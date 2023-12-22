import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int[] w = new int[n + 1];
		int[] r = new int[n + 1];
		Arrays.fill(w , -1);
		Arrays.fill(r , -1);
		int wcount = 0;
		int rcount = 0;
		for(int i = 0 ; i < n ; i++) {
			if(s.charAt(i) == 'W') {
				w[wcount] = i;
              wcount++;
			}
			if(s.charAt(n - i - 1) == 'R') {
				r[rcount] = n - i - 1;
              rcount++;
			}
		}
		int ans = 0;
		for(int i = 0 ; i < wcount && i < rcount ; i++) {
			if(w[i] < r[i])
				ans++;
			else
				break;

		}



		sc.close();
		System.out.println(ans);

	}
}

