import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();

		int len = 1;
		int lenMax = 0;
		// st:調べる文字列の先頭
		for ( int st = 0; st + len - 1 < n; st++ ) {
			// 切り出す
			String temp = s.substring(st, st + len);
			// 自分以降に2個目がある限りlenを増やす
			while ( s.indexOf(temp, st + len) > st ) {
				len++;
				temp = s.substring(st, st + len);
			}
			// Maxを記憶（lenは行き過ぎてるので -1）
			lenMax = Math.max(lenMax, len - 1);
			if(lenMax > 1) len = lenMax;
		}

		System.out.println(lenMax);
		in.close();
	}
}