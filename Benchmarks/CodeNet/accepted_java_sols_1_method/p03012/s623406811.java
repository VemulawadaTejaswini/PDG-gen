import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] w = new int[n];
		for(int i=0;i<n;i++) w[i] = in.nextInt();
		int s1 = w[0];
		int s2 = 0;
		for(int i=1;i<n;i++) s2 += w[i];
		int ans = Math.abs(s1-s2);
		for(int i=1;i<n-1;i++) {
			s1 += w[i];
			s2 -= w[i];
			ans = Math.min(ans, Math.abs(s1-s2));
		}
		System.out.println(ans);
		
		
		in.close();

	}

}
