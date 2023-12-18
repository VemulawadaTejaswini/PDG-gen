import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		int list[] = {0,1,2,3,5,7,8,9};
		int mask = 7;

		try {
			while (!(buf= br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				int t[] = new int[11];
				int digit = 0;
				while (n>0) {
					t[digit] = (n&mask);
					n >>= 3;
					digit++;
				}
				for (int i=digit-1;i>=0;i--) {
					System.out.print(list[t[i]]);
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}