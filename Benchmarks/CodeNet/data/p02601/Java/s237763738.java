import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		boolean flag = false;
		for (int i=0;i<=K;i++) {
			long B_tmp = B;
			long C_tmp = C;
			for (int j=0;j<i;j++) {
				B_tmp = B_tmp*B_tmp;
			}
			for (int j=0;j<K-i;j++) {
				C_tmp = C_tmp*C_tmp;
			}
			if ((A < B_tmp) && (B_tmp < C_tmp)) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Yes");
		} else { // !flag
			System.out.println("No");
		}
	}
}