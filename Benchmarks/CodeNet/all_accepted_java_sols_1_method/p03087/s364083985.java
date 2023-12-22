import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		String S = br.readLine();
		int[] a = new int[N];
		for (int i = 0; i < N-1; i++) {
			if (S.charAt(i) == 'A' && S.charAt(i+1) == 'C') a[i+1]++;
		}
		int[] psa = new int[N];
		psa[0] = a[0];
		for (int i = 1; i < N; i++) {
			psa[i] = psa[i-1] + a[i];
		}
		while (Q-->0) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			System.out.println(psa[r-1]-psa[l-1]);
		}
	}
	
}