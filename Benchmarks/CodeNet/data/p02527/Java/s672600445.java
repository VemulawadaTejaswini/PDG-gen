import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
				String[] s = br.readLine().split(" ");
				int a[] = new int[n];
				for(int i = 0;i < n;i++) {
					a[i] = Integer.parseInt(s[i]);
				}
				Arrays.sort(a);
				String t = String.valueOf(a[0]);
				for(int j = 1;j < n;j++) {
					t += " " + a[j];
				}
				System.out.println(t);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}