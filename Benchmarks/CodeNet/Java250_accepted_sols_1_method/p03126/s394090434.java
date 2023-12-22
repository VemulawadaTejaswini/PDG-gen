import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Integer[][] a = new Integer[N][M];
		for (int i=0;i<N;i++) {
			int K = sc.nextInt();
			Integer[] b = new Integer[K];
			for (int x=0;x<K;x++) {
				b[x]=sc.nextInt();
			}
			a[i]=b;
		}
		int len = a[0].length;
		int cnt = 0;
		for (int i=0;i<len;i++) {
			for (int k=0;k<N;k++) {
				if (Arrays.asList(a[k]).contains(a[0][i])) {
					if (k==N-1) {
						cnt++;
					}
				}else {
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}