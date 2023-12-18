

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		String[] s = new String[h];
		for(int i = 0;i<h;i++) {
			s[i] = sc.next();
		}
		
		String[][] c = new String[h][w];
		for(int i = 0;i<h;i++) {
			for(int j = 0;j<w;j++) {
				c[i][j]=s[i].substring(j,j+1);
			}
		}
		int ans = 0;
		
		int hw = (int)Math.pow(2, h+w);
		for(int i = 0;i<=hw;i++) {
			String str = String.format("%0"+(h+w)+"d", Long.parseLong(Long.toBinaryString(i)));
			String[][] cc = new String[h][w];
			for(int j = 0;j<h;j++) {
				cc[j] = c[j].clone();
			}
			
			for(int j = 0;j<h;j++) {
				if(str.subSequence(j, j+1).equals("0")) {
					for(int l = 0;l<w;l++) {
						cc[j][l] = ".";
					}
				}
			}
			for(int j = h;j<h+w;j++) {
				if(str.subSequence(j, j+1).equals("0")) {
					for(int l = 0;l<h;l++) {
						cc[l][j-h] = ".";
					}
				}
			}
			
			int count = 0;
			for(int j = 0;j<h;j++) {
				for(int l = 0;l<w;l++) {
					if(cc[j][l].equals("#"))
						count++;
				}
			}
			if(count==k)
				ans++;
		}
		System.out.println(ans);
	}

}
