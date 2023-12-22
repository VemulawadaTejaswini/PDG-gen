import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		String str = sc.next();

		int[] tmp = new int[3];
		tmp[0] = Integer.parseInt(String.valueOf(str.charAt(0)));
		tmp[1] = Integer.parseInt(String.valueOf(str.charAt(2)));
		tmp[2] = Integer.parseInt(String.valueOf(str.charAt(3)));
		sc.close();


		long a = A * tmp[0];
		long b = A * tmp[1];
		long c = A * tmp[2];

		long tmpb = b / 10;
		long tmpc = c / 100;

		//小数点以下の計算
		long tmpb2 = (b % 10) * 10;
		long tmpc2 = c % 100;
		//繰り上がりで1足されるかどうか確認
		long tmpx = (tmpb2 + tmpc2) / 100;

		long ans = a + tmpb + tmpc + tmpx;
		System.out.println(ans);

	}

}