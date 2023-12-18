import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer tok = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(tok.nextToken());
		int M = Integer.parseInt(tok.nextToken());
		boolean arr[] = new boolean[N + 1];
		int arr2[] = new int[N + 1];
		arr[1] = true;
		Arrays.fill(arr2, 1);
		int cont = 0;
		for (int i = 0; i < M; i++) {
			tok = new StringTokenizer(in.readLine());
			int x = Integer.parseInt(tok.nextToken());
			int y = Integer.parseInt(tok.nextToken());
			if (arr[x]) {
				if (arr2[x] != 0) {
					// cont++;
					arr2[y]++;
					arr2[x]--;
					if (arr2[x] == 0) {
						arr[x] = false;
					}
					arr[y] = true;
				} else {
					arr2[y]++;
					arr2[x]--;
				}
			} else {
				arr2[y]++;
				arr2[x]--;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i])
				cont++;
		}
		out.println(cont);
		out.close();
	}
}