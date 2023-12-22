import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int T = scan.nextInt();
		int a = scan.nextInt();
		int[] h = new int[n];
		double[] t = new double[n];

		int ans = -1;
		for(int i=0; i<n; i++) {
			h[i] = scan.nextInt();
			t[i] = Math.abs((T - h[i]*0.006)-a);
			if(ans==-1) {
				ans=i;
			}else if(t[i]<t[ans]) {
				ans=i;
			}
		}
		System.out.println(ans+1);
	}
}