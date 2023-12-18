import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] S = new String[H];
		for(int i = 0;i < H;i ++) {
			S[i] = sc.next();
		}
		int[][] data = new int[H][W];
		for(int i = 0;i < H;i ++) {
			for(int k = 0;k < W;k ++) {
				char c  = S[i].charAt(k);
				if(c == '#') continue;
				char c1, c2, c3, c4, c5, c6, c7, c8;
				if(i != 0 && k != 0) {
					c1 = S[i-1].charAt(k-1);
					if(c1 == '#') data[i][k]++;
				}
				if(i != 0) {
					c2 = S[i-1].charAt(k);
					if(c2 == '#') data[i][k]++;
				}
				if(i != 0 && k != W - 1) {
					c3 = S[i-1].charAt(k+1);
					if(c3 == '#') data[i][k]++;
				}
				if(k != 0) {
					c4 = S[i].charAt(k-1);
					if(c4 == '#') data[i][k]++;
				}
				if(k != W - 1) {
					c5 = S[i].charAt(k+1);
					if(c5 == '#') data[i][k]++;
				}
				if(i != H - 1 && k != 0) {
					c6 = S[i+1].charAt(k-1);
					if(c6 == '#') data[i][k]++;
				}
				if(i != H -1) {
					c7 = S[i+1].charAt(k);
					if(c7 == '#') data[i][k]++;
				}
				if(i != H - 1 && k != W - 1) {
					c8 = S[i+1].charAt(k+1);
					if(c8 == '#') data[i][k]++;
				}
			}
		}
		for(int i = 0;i < H;i ++) {
			for(int k = 0;k < W;k ++) {
				char c = S[i].charAt(k);
				if(c != '#') System.out.print(data[i][k]);
				else System.out.print("#");
			}
			System.out.println("");
		}
	}
}