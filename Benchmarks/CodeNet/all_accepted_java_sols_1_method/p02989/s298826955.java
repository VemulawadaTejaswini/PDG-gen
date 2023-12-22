import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] d = new int[N];
		for(int i = 0;i < N;i++) {
			d[i] = scn.nextInt();
		}
		Arrays.sort(d);
		int dd = d[N/2-1];
		int du = d[N/2];
		int ans = 0;
		if(dd!=du) {
			ans = du-dd;
		}
		System.out.println(ans);
	}

}
