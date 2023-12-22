import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		boolean flag = true;
		int f = 0;
		int pre = A[0];
		int ans = 1;
		for(int i = 1; i < N; i++) {
			if(f == 0) {
				if(A[i] > pre) {
					f = 1;
				} else if(A[i] < pre) {
					f = -1;
				}
			} else if(f == 1) {
				if(A[i] < pre) {
					ans++;
					f = 0;
				}
			} else {
				if(A[i] > pre) {
					ans++;
					f = 0;
				}	
			}
			pre = A[i];
		}
		System.out.println(ans);
	}
}
