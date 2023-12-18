import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				int a[] = new int[10];
				for (int i=0;i<10;i++) {
					a[i] = Character.getNumericValue(buf.charAt(i));
				}
				for (int i=9;i>=2;i--) {
					int b[] = new int[i];
					for (int j=0;j<i;j++) {
						b[j] = (a[j]+a[j+1])%10;
					}
					for (int j=0;j<i;j++) a[j] = b[j];
				}
				System.out.println((a[0]+a[1])%10);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}