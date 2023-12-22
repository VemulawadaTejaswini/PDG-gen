import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(in.readLine());
		
		long c = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if(a[i] % 2 == 0) {
				c += a[i] / 2;
				a[i] = 0;
			}
			else {
				if(a[i + 1] > 0) {
					c += (a[i] + 1) / 2;
					a[i] = 0;
					a[i+1]--;
				}
				else {
					c += (a[i] - 1) / 2;
					a[i] = 1;
				}
			}
		}
		
		c += a[a.length -1]/2;
		
		System.out.println(c);
	}
}
