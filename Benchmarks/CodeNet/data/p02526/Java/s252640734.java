import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count = 0;
			boolean[] a = new boolean[100000];
			Arrays.fill(a, false);
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			for(int i = 0;i < n;i++)
				a[Integer.parseInt(s[i])] = true;
			int m = Integer.parseInt(br.readLine());
			String[] t = br.readLine().split(" ");
			for(int i = 0;i < m;i++)
				if(a[Integer.parseInt(t[i])])
					count++;
			System.out.println(count);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}