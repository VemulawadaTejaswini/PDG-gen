import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		String S = scan.nextLine();
		String src;
		String dest;
		boolean exist = false;

		int index = 0;
		int ans = 0;

		while (index + ans + 1 <= N) {
			src = S.substring(index, index + ans + 1);
			for (int i = index + ans + 1 ; i + ans + 1 <= N; i++) {
				dest = S.substring(i, i + ans + 1);
				if (src.equals(dest)) {
					ans = src.length();
					exist = true;
					break;
				}
			}
			// 一致するものがない場合は次の文字に
			if (!exist) {
				index++;
			}
			exist = false;
		}
		System.out.println(ans);
	}
}
