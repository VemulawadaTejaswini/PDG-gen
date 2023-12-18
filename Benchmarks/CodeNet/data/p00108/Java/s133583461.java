import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				StringTokenizer st = new StringTokenizer(br.readLine());
				int S[] = new int[n];
				int C[] = new int[n];
				boolean check[] = new boolean[n];
				for (int i=0;i<n;i++) {
					S[i] = Integer.parseInt(st.nextToken());
				}
				int list[] = new int[n];
				int lp = 0;
				int m;
				int count = 0;
				while (true) {
					count++;
					Arrays.fill(C,0);
					Arrays.fill(check,false);
					for (int i=0;i<n;i++) {
						if (!check[i]) {
							check[i] = true;
							list[lp++] = i;
							for (int j=i+1;j<n;j++) {
								if (S[i]==S[j]) {
									check[j] = true;
									list[lp++] = j;
								}
							}
							m = lp;
							while (lp>0) {
								C[list[--lp]] = m; 
							}
						}
					}
					if (check_equal(S,C,n)) break;
					for (int i=0;i<n;i++) {
						S[i] = C[i];
					}
				}
				System.out.println(count-1);
				System.out.print(S[0]);
				for (int i=1;i<n;i++) {
					System.out.print(" "+S[i]);
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean check_equal(int a[],int b[],int size) {
		for (int i=0;i<size;i++) {
			if (a[i]!=b[i]) return false;
		}
		return true;
	}
}