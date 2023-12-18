import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] minsL = new int[n+2];
		int[] maxsL = new int[n+2];
		int[] maxsR = new int[n+2];
		int[] minsR = new int[n+2];
		int[] kawase = new int[n+2];

		minsL[0] = Integer.MAX_VALUE;
		maxsL[0] = 0;
		for(int i=1;i<=n;i++) {
			kawase[i] = in.nextInt();
			minsL[i] = Math.min(minsL[i-1], kawase[i]);
			maxsL[i] = Math.max(maxsL[i-1], kawase[i]);
		}
		minsR[n+1] = Integer.MAX_VALUE;
		maxsR[n+1] = 0;
		for(int i=n;i>=1;i--) {
			minsR[i] = Math.min(minsR[i+1], kawase[i]);
			maxsR[i] = Math.max(maxsR[i+1], kawase[i]);
		}

		int ans = Integer.MIN_VALUE;
		for(int i=1;i<n;i++) {
			ans = Math.max(ans, maxsR[i+1] - minsL[i]);
//			ans = Math.max(ans, Math.abs(maxsL[i] - minsR[i+1]));
		}
		System.out.println(ans);
	}
}