import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int k = sc.nextInt();
		int n = 0;
		char[][] c = new char[h][w];
		for(int i = 0; i < h; i++) {
				c[i]= sc.next().toCharArray();
		}

		int a = 0;
		int ans = 0;
		for(int l = 0; l < Math.pow(2, h+w); l++) {
			int black = 0;
			String ni = "00000000000" + Integer.toBinaryString(a);
			//System.out.println(ni+ " " + ni.charAt(ni.length()-1));
			for(int i = 0; i  < h; i++) {
				for(int j = h; j < h+w; j++) {
					//System.out.println(ni.charAt(i) + ni.charAt(j));
					if(ni.charAt(ni.length()-1-i) == '0' && ni.charAt(ni.length()-1-j) == '0') {		
						if(c[i][j-h]== '#') {
							++black;
						}
					}
				}
			}
			if(black == k) {
				//System.out.println(black);
				++ans;
				//System.out.println(ni);
			}
			++a;
		}
		System.out.println(ans);
	}
}
