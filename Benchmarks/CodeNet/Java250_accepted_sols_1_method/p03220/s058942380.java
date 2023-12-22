import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		int A = in.nextInt();
		int h[] =new int[N];
		double t[] =new double[N];
		for (int i = 0; i < N; i++) {
			h[i]= in.nextInt();
			t[i]=Math.abs((T-h[i]*0.006)-A);
		}
		int minn=10000;
		double min=10000000;
		for (int i = 0; i < N; i++) {
			if(min>t[i]) {
				min=t[i];
				minn=i;
			}
		}
		System.out.println(minn+1);
	}
}
