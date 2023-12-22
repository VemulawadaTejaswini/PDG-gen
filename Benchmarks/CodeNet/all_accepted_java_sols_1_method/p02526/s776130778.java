import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count = 0;
			boolean[] a = new boolean[10000001];
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			for(int i = 0;i < n;i++)
				a[Integer.parseInt(s[i])] = true;
			int m = Integer.parseInt(br.readLine());
			s = br.readLine().split(" ");
			for(int i = 1;i <= m;i++)
				if(a[Integer.parseInt(s[i])])
					count++;
			System.out.println(count);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}