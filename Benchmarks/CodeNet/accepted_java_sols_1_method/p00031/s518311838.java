import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				int m = 1;
				int e = 1;
				int n = Integer.parseInt(buf);
				while (n>0) {
					int check = n&m;
					if (check == m) {
						System.out.print(e);
						if (n>1) System.out.print(" ");
					}
					n >>= 1;
					e <<= 1; 
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}