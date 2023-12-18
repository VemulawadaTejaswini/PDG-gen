import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s[];
			int a[] = new int[3];
			int n = Integer.parseInt(reader.readLine());
			for(int i = 0;i < n;i++) {
				s = reader.readLine().split(" ");
				for(int j = 0;j < a.length;j++) {
					a[j] = Integer.parseInt(s[j]);
				}
				int t = (a[0] + a[1] + a[2]) / 2;
				int S = t*(t-a[0])*(t-a[1])*(t-a[2]);
				if(S == a[0]*a[1]*a[0]*a[1]/4 || S == a[1]*a[2]*a[1]*a[2]/4 || S == a[2]*a[0]*a[2]*a[0]/4)
					System.out.println("YES");
				else
					System.out.println("NO");
			}

		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}