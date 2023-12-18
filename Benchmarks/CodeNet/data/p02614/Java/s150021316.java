import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		char c[][]= new char[H][W];
		for (int i=0;i<H;i++) {
			String s= sc.next();
			for (int j=0;j<W;j++) {
				c[i][j] = s.charAt(j);
			}
		}
		int h[] = new int[H];
		int w[] = new int[W];
		int sum =0;
		for (int i=0;i<H;i++) {
			int count =0;
			for (int j=0;j<W;j++) {
				if (c[i][j]=='#') {
					count ++;
				}
			}
			h[i]=count;
			sum +=h[i];
		}
		for (int i=0;i<W;i++) {
			int count =0;
			for (int j=0;j<H;j++) {
				if (c[j][i]=='#') {
					count ++;
				}
			}
			w[i]=count;
		}
		int result =0;
		for (int i=0;i<Math.pow(2, H);i++) {
			for (int j=0;j<Math.pow(2, W);j++) {
				int count = Main.count(h, i)+Main.count(w, j);
				count -=Main.c(c, i, j);
				if (sum-count ==K) {
					result++;
				}
			}
		}
		System.out.println(result);
	}

	public static int c(char H[][],int h,int w) {
		int count =0;
		int i=0;
		int j=0;
		while (h>0) {
			int temp =w;
			if (h%2==1) {
				j=0;
				while (temp>0) {
					if (temp%2==1&&H[i][j]=='#') {
						count++;
					}
					j++;
					temp/=2;
				}
			}
			h/=2;
			i++;
		}
		return count;
	}
	public static int count(int h[],int c) {
		int result =0;
		int i=0;
		while (c>0) {
			if (c%2==1) {
				result+=h[i];
			}
			c/=2;
			i++;
		}
		return result;
	}
}