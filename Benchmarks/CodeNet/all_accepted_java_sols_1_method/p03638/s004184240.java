import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int[][] c = new int[H][W];
		int wCount = 0;
		int hCount = 0;
		for(int i=0;i<n;i++) {
			int aCount = 0;
			while(aCount<a[i]) {
				c[hCount][wCount] = i+1;
				aCount++;
				if(hCount%2==0) {
					wCount++;
					if(wCount==W) {
						wCount--;
						hCount++;
					}
				}
				else {
					wCount--;
					if(wCount==-1) {
						wCount++;
						hCount++;
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		String ls = System.lineSeparator();
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				sb.append(c[i][j] + " ");
			}
			sb.append(ls);
		}
		System.out.println(sb.toString());
		in.close();

	}

}
