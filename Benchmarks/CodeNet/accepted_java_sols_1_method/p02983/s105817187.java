import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int mod = 2019;
		int L_mod = L%2019;
		int R_mod = R%2019;
		if (R-L>=2018 || L_mod>=R_mod) {
			System.out.println(0);
		} else {
			int min = Integer.MAX_VALUE;
			for (int i=L_mod;i<R_mod;i++) {
				for (int j=i+1;j<=R_mod;j++) {
					min = Math.min(min, i*j%mod);
				}
			}
			System.out.println(min);
		}
	}
}