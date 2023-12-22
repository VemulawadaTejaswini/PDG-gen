import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		in.nextInt();
		int m = in.nextInt();
		int city[][] = new int[m][4]; // 0:id, 1:pref, 2:year, 3:number
		int id = 0;
		for ( int c[] : city ) {
			c[0] = id++;
			c[1] = in.nextInt();
			c[2] = in.nextInt();
		}
		in.close();

		// pref, yearでソート
		Arrays.sort(city, (c1, c2) -> {
			return (c1[1] != c2[1]) ? c1[1] - c2[1] : c1[2] - c2[2];
		});

		// ナンバリング
		city[0][3] = 1;
		for ( int i = 1; i < m; i++ ) {
			city[i][3] = (city[i][1] == city[i - 1][1] ? city[i - 1][3] + 1 : 1);
		}

		// idでソート
		Arrays.sort(city, (c1, c2) -> {
			return c1[0] - c2[0];
		});

		// 整形して出力
		DecimalFormat df = new DecimalFormat("000000");
		StringBuilder sb = new StringBuilder();
		for ( int c[] : city ) {
			sb.append(df.format(c[1])).append(df.format(c[3])).append("\n");
		}
		System.out.println(sb);
	}
}
