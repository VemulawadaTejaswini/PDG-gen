
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] p = new int[n];
		int ans = 0;

		for(int i = 0; i < n; i++)
			p[i] = in.nextInt();

		for(int i = 1; i<n-1; i++) {
			boolean dontMax = (p[i] < Math.max(p[i-1], p[i+1]));
			boolean dontMin = (p[i] > Math.min(p[i-1], p[i+1]));
			if(dontMax && dontMin)
				ans++;

		}

		System.out.println(ans);
	}

}