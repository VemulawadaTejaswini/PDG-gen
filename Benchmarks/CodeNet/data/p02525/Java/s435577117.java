import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (0 == n) break;
			String[] in = br.readLine().split(" ");
			int[] ary = new int[n];
			for (int i=0; i<n; i++) ary[i] = Integer.parseInt(in[i]); 
			int sum = 0;
			for (int num : ary) sum += num;
			double m = sum/n;
			double a = 0.0;
			for (int j=0; j<n; j++) a += Math.pow(ary[j]-m, 2);
			System.out.println(Math.sqrt(a/n));
		}
	}
}