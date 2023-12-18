import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] freq = new int[(int) 1e5 + 1];
		long sum = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			sum += num;
			freq[num]++;
		}

		int Q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int q = 0; q < Q; q++) {
			String[] tokens = br.readLine().split(" ");
			int b = Integer.parseInt(tokens[0]);
			int c = Integer.parseInt(tokens[1]);
			sum += (c - b) * freq[b];
			freq[c] += freq[b];
			freq[b] = 0;
			sb.append(sum + "\n");
		}
		System.out.println(sb);
	}

}