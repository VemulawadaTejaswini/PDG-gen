import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long mod = 1000000007L;

		int n = sc.nextInt();

		long x0x9 = 0;
		long x0o9 = 0;
		long o0x9 = 0;
		long o0o9 = 0;

		for ( int i=1; i<=n; i++ ) {

			if ( i==1 ) {
				x0x9 = 8;
				x0o9 = 1;
				o0x9 = 1;
				continue;
			}

			long pre_x0x9 = x0x9;
			long pre_x0o9 = x0o9;
			long pre_o0x9 = o0x9;
			long pre_o0o9 = o0o9;

			long wk_x0o9 = 0;
			long wk_o0x9 = 0;
			long wk_o0o9 = 0;

			x0x9 = (pre_x0x9*8)%mod;
			x0o9 = (pre_x0x9 + pre_x0o9*9)%mod;
			o0x9 = (pre_x0x9 + pre_o0x9*9)%mod;
			o0o9 = (pre_x0o9 + pre_o0x9 + pre_o0o9*10)%mod;

		}

		System.out.println(o0o9);
	}
}