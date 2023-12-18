import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine().trim());
		long[] arr = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		long[] res = new long[n];
		res[0] = 2*arr[0];
		for(int i = 1; i < n; i++){
			res[i] = 2*arr[i-1] - res[i-1];
		}
		long d = 2*arr[n-1] - res[0] - res[n-1];
		for(int i = 0; i < n; i++){
			if(i%2 == 0) res[i] += d/2;
			else res[i] -= d/2;
		}
		StringBuilder sb = new StringBuilder();
		for(long k: res) sb.append(k+" ");
		bw.write(sb.toString().trim()+"\n");
		bw.flush(); bw.close();
	}

}
