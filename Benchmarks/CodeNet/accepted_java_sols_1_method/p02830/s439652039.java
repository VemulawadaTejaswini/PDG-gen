import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	static String matrix[][];
	static int dist[][];
	static boolean used[][];

	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	static int w;
	static int h;

	static int min = Integer.MAX_VALUE;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		String str1[] = str[0].split("");
		String str2[] = str[1].split("");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(str1[i]);
			sb.append(str2[i]);
		}
		System.out.println(sb);
	}
}