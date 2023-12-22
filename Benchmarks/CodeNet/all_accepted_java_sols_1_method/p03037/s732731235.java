import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int l = 1;
		int r = N;
		for(int i = 0;i < M;i++) {
			int ll = scn.nextInt();
			int rr = scn.nextInt();
			l = Math.max(ll, l);
			r = Math.min(r, rr);
		}
		System.out.println((l > r)?0:r-l+1);
	}

}
