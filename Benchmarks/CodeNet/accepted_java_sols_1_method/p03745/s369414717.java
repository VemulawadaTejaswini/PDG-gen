import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N];
		for(int i =0;i < N;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int cnt = 1;
		int flg = 0;
		for(int i = 0;i < N-1;i++) {
			if(A[i] > A[i+1]) {
				if(flg == -1) {
					cnt++;
					flg = 0;
				}else if(flg == 0) {
					flg = 1;
				}
			}else if(A[i] < A[i+1]) {
				if(flg == 1) {
					cnt++;
					flg = 0;
				}else if(flg == 0) {
					flg = -1;
				}
			}
		}
		System.out.println(cnt);
	}

}