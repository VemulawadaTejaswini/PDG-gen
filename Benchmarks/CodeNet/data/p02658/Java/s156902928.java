import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		long res = 1;
		long[] a = new long[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Long.parseLong(st.nextToken());
			if(a[i] == 0)
				res = 0;
		}
		
		if(res != 0) {
			for(int i=0; i<n; i++) {
				if(a[i] <= (long)Math.pow(10, 18)/res)
					res *= a[i];
				else {
					res = -1;
					break;
				}
			}
		}
		bw.write(res + "\n");
		bw.flush();
	}

}
