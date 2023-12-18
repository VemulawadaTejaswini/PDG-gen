import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int N;
	static String S;
	static int[] sum;

	public static void main(String[] args) {
		//入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			N = Integer.parseInt(br.readLine());
			S = br.readLine();
			sum = new int[N+1];
		} catch(IOException e) {
			e.printStackTrace();
		}

		for(int i=0; i<N; i++) {
			if(S.charAt(i)=='.') sum[0]++;
		}

		for(int i=1; i<N+1; i++) {
			if(S.charAt(i-1)=='#') {
				sum[i] = sum[i-1] + 1;
			} else {
				sum[i] = sum[i-1] - 1;
			}
		}

		Arrays.sort(sum);
		System.out.println(sum[0]);
	}
}