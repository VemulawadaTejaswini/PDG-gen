import java.util.Scanner;

public class Main {
	public static void main(String[]args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		long result = 0;
		// 各数字の間の数
		int n = s.length() - 1;

		String[] sArray = s.split("");
		int[] sIntArray = new int[sArray.length];
		for(int i = 0; i < sArray.length; i++) {
			sIntArray[i] = Integer.valueOf(sArray[i]);
		}
		long temp = 0;
		// {0,1 ・・・, n - 1}の部分集合の全探索
		for(int bit = 0; bit < (1 << n); bit++) {
			temp = sIntArray[0];
			for(int i = 0; i < n; i++) {
				if(((bit >> i) & 1) == 1) {
					// プラス記号を挿入する場合の処理
					result += temp;
					temp = 0;
				}
				temp *= 10;
				temp += sIntArray[i + 1];
			}
			result += temp;
		}

		System.out.println(result);
	}
}
