import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s = new Scanner(System.in).next();
		// + が入る可能性のある個所
		int n = s.length() - 1;
		long sum = 0;
		StringBuilder parts = new StringBuilder();
		for (int i = 0; i < (1<<n); i++) {
			for(int j = 0; j < n; j++) {
				parts.append(s.charAt(j));
				// フラグが立っている場合はそこに + が挟まれるため、
				// 文字列を数値に変換の上加算する
				if ((1 & i>>j) == 1) {
					sum = sum + Long.parseLong(parts.toString());
					parts.setLength(0);
				}
			}
			// 文字列sの最後の1文字を追加して加算する
			parts.append(s.charAt(n));
			sum = sum + Long.parseLong(parts.toString());
			parts.setLength(0);
		}
		System.out.println(sum);
	}
}
