import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		long[] a = new long[n];
		long min = 1000000;
		long max = -1000000;
		long sum = 0;

		for(int i = 0; i < n; i++){
			a[i] = Long.parseLong(st.nextToken());
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
			sum += a[i];
		}

		System.out.println(min + " " + max + " " + sum);

	}
}