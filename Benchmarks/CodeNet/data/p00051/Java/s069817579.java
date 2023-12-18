import java.io.*;
import java.util.Arrays;

class Main {
	private static final String number = "0123456789";

	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());
			for (int i=0;i<n;i++) {
				String v = br.readLine();
				int a[] = new int[8];
				int max[] = new int[8];
				int min[] = new int[8];
				for (int j=0;j<8;j++) {
					a[j] = Character.getNumericValue(v.charAt(j));
				}
				Arrays.sort(a);
				for (int j=0;j<8;j++) {
					min[j] = a[j];
					max[j] = a[7-j];
				}
				int dif[] = new int[8];
				sub(max,min,dif);

				int c = 0;
				while (dif[c]==0) c++;
				for (int j=c;j<8;j++) {
					System.out.print(dif[j]);
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sub(int a[],int b[],int c[]) {
		for (int i=7;i>=0;i--) {
			c[i] = a[i]-b[i];
			if (c[i]<0) {
				a[i-1] -= 1;
				c[i] += 10;
			}
		}
	}
}