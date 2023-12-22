import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long h = sc.nextLong();

		long t = 0;
		long hc = h;
		long k = 1;
		while ( hc > 1 ) {
			hc = hc / 2l;
			t = t + k;
			k = k * 2l;
		}

		t = t + k;

		// 出力
		System.out.println(t);

	}
}