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

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		if (a + b == 3) {
			System.out.println(3);
		} else if (a + b == 4) {
			System.out.println(2);
		} else {
			System.out.println(1);
		}
	}
}