import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s[];
			int a[] = new int[3];
			boolean flag = false;
			int n = Integer.parseInt(reader.readLine());
			for(int i = 0;i < n;i++) {
				s = reader.readLine().split(" ");
				for(int j = 0;j < a.length;j++) {
					a[j] = Integer.parseInt(s[j]);
				}
				for(int k = 0;k < 3;k++) {
					if(a[k%3]*a[k%3]+a[(k+1)%3]*a[(k+1)%3] == a[(k+2)%3]*a[(k+2)%3]) {
						flag = true;
						break;
					}
				}
				if(flag) {
					System.out.println("YES");
					flag = false;
				}
				else
					System.out.println("NO");
			}

		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}