import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int last = n%10;
		if (last == 1 || last == 3 || last == 7 || last ==9) {
			int wei = String.valueOf(n).length();
			StringBuilder big = new StringBuilder();
			for (int i = 0; i < wei; i++) {
				big.append("7");
			}
			int yu = tenMod(big.toString(), n);
			for(int i = wei;i<1000000;i++) {
				if (yu == 0) {
					System.out.println(i);
					return;
				}
				yu = (yu*10+7)%n;
			}
		} else {
			System.out.println(-1);
		}
	}

	public static int tenMod(String tenString, int mod) {
		if (mod == 0) {
			return -1;
		}
		int temp = 0;
		for (int i = 0; i < tenString.length(); i++) {
			temp = temp % mod;
			temp = (temp * 10) + Integer.valueOf(String.valueOf(tenString.charAt(i)));
		}
		return temp % mod;
	}

}
