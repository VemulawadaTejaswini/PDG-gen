import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long K = sc.nextLong(), A = sc.nextLong(), B = sc.nextLong();
		if(A + 2 >= B) System.out.println(K + 1);
		else {
			/* make A cookies */
			if(K <= A) {
				System.out.println(K + 1);
			}else {
				K -= (A + 1);
				long ans = B;
				ans += (B - A) * (K / 2);
				System.out.println(ans + ((K % 2 == 1) ? 1 : 0));
			}
		}
	}
}
