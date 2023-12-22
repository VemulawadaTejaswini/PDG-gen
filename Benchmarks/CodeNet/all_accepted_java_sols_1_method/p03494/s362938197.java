import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		boolean flag = true;
		int cnt = 0;
		while(flag) {
			for(int i = 0; i < N; i++) {
				if(A[i] % 2 == 0) {
					A[i] /= 2;
				}else {
					flag = false;
				}
			}
			if(flag) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}