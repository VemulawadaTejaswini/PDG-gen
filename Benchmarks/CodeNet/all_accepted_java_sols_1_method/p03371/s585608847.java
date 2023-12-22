import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int A, B, AB, X, Y;

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(f.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		AB = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		int res = 0;
		if (X >= Y) {
			int t = X;
			X = Y;
			Y = t;
			t = A;
			A = B;
			B = t;
		}
		// System.out.println(A + " " + B + " " + AB + " " + X + " " + Y);
		if (2 * AB <= B) {
			res = Y * (2 * AB);
		} else if (2 * AB < A + B) {
			res += X * (2 * AB);
			Y -= X;
			res += Y * B;
		} else {
			res = X * A + Y * B;
		}
		System.out.println(res);
	}
}