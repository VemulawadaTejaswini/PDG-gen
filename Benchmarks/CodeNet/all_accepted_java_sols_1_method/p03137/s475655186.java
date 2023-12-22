import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] x = new int[m];
		for(int i=0;i<m;i++) {
			x[i] = in.nextInt();
		}
		if(n>=m) System.out.println(0);
		else {
			Arrays.sort(x);
			int[] dif = new int[m-1];
			for(int i=0;i<m-1;i++) {
				dif[i] = x[i+1] - x[i];
			}
			Arrays.sort(dif);
			int ans = 0;
			for(int i=0;i<m-n;i++) {
				ans += dif[i];
			}
			System.out.println(ans);
		}
		in.close();

	}

}
