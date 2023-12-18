
import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			int n, sum = 0;
			double sig = 0;
			while((n = Integer.parseInt(br.readLine())) != 0) {
				String[] s = br.readLine().split(" ");
				int[] p = new int[n];
				for(int i = 0;i < n;i++) {
					p[i] = Integer.parseInt(s[i]);
					sum += p[i];
				}
				double m = sum*1.0/n;
				for(int i = 0;i < n;i++) {
					sig += (p[i]-m)*(p[i]-m);
				}
				double alpha = Math.sqrt(sig/n);
				System.out.printf("%5.5f\n", alpha);
				sum = 0;
				sig = 0.0;
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}