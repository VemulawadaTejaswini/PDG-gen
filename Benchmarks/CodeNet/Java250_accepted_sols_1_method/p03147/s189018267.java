import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] h = new int[N];
		for (int i=0;i<N;i++) {
			h[i]=Integer.parseInt(sc.next());
		}

		int cnt=0;
		loop:while (true) {
			int left=0;
			for (int i=0;i<N;i++) {
				if (h[i]!=0) {
					left=i;
					break;
				}
				if (i==N-1) {
					break loop;
				}
			}
			for (int i=left;i<N;i++) {
				if (h[i]>0) {
					h[i]--;
					if (i==N-1) {
						cnt++;
					}
				} else if (h[i]==0 || i==N-1) {
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}