import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long K = scn.nextLong();
		long A = scn.nextLong();
		long B = scn.nextLong();
		long ans = 1;
		if(B < A+2) {
			ans = K+1;
		}else {
			if(K <A+1) {
				ans = K+1;
			}else {
				ans = A;
				K -= A-1;
				while(K >= 2) {
					K-=2;
					ans += B-A;
				}
				ans += K;
			}
		}



		System.out.println(ans);
	}

}
