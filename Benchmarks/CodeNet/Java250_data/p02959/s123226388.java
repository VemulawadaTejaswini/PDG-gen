import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] a = new long[N+1];
		for(int i=0; i<N+1; i++) {
			a[i] = sc.nextLong();
		}

		long[] b = new long[N];
		for(int i=0; i<N; i++) {
			b[i] = sc.nextLong();
		}

		sc.close();

		long cnt=0, tmp = 0;
		for(int i=0; i<N; i++) {

			if(i==0) {
				cnt += Math.min(a[i], b[i]);
				tmp = Math.min(a[i+1],b[i] - Math.min(a[i],b[i]));
				cnt += tmp;
			}

			if(i!=0) {
				cnt += Math.min(a[i] - tmp, b[i]);
				tmp = Math.min(a[i+1],b[i] - Math.min(a[i] - tmp, b[i]));
				cnt += tmp;
			}
		}

		System.out.println(cnt);
	}
}