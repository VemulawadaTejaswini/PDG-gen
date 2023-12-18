import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] pos = new int[n];
		for (int i=0;i<n;i++) {
			pos[i]=sc.nextInt();
		}
		int ans = Integer.MAX_VALUE;

		for (int i=0;i<n-k+1;i++) {
			ans = Math.min(ans, pos[i+k-1]-pos[i]+Math.min(Math.abs(pos[i+k-1]), Math.abs(pos[i])));
		}

		System.out.println(ans);
	}

}
