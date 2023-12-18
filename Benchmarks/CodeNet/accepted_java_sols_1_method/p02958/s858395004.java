import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		int[] p = new int[N];
		int[] q = new int[N];
		for (int i = 0; i < N; ++i) {
			p[i] = Integer.parseInt(tokens[i]);
			q[i] = p[i];
		}
		Arrays.sort(q);
		int count = 0;
		for (int i = 0; i < N; ++i) {
			if(p[i] != q[i]) {
				++count;
			}
		}
		if (count <= 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}