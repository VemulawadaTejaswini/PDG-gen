import java.util.*;
import java.io.*;

class Main {

	void solve() {
		
		int five = 0, seven = 0;
		for (int i=0; i<3; i++) {
			if (inint() == 5) five++;
			else seven++;
		}
		
		out.println(five==2&&seven==1? "YES" : "NO");
		
	}

	public static Scanner in = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		new Main().solve();
		out.flush();
	}

	public int inint() {
		return in.nextInt();
	}

	public long inlong() {
		return in.nextLong();
	}

	public String instr() {
		return in.next();
	}

	public char inchar() {
		return in.next().charAt(0);
	}

	public int[] inintar(int num) {
		int[] a = new int[num];
		for (int i=0; i<num; i++) {
			a[i] = in.nextInt();
		}
		return a;
	}

	public char[] incharar() {
		return in.next().toCharArray();
	}

	public char[][] incharmap(int h, int w) {
		char[][] a = new char[h][w];
		for (int i=0; i<h; i++) {
			String temp = in.next();
			for (int j=0; j<w; j++) {
				a[i][j] = temp.charAt(j);
			}
		}
		return a;
	}

}