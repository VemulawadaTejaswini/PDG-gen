
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	static int h;
	static int w;
	static int k;
	static String[][] S;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    h=gi();
	    w=gi();
	    k=gi();
	    S = new String[h][w];

	    for (int i=0; i<h;i++) {
	    	String s=gs();
	    	for (int j=0; j<w; j++) {
	    		S[i][j]=String.valueOf(s.charAt(j));

	    	}
	    }
	    int c=0;
	    for (int i=0; i<Math.pow(2, h+w);i++) {
	    	int ik=f(i);
	    	if (ik==k) {
	    		c++;
	    	}
	    }



	    System.out.println(c);

//	    if (isNumber(s1) && isNumber(s2) && s.charAt(a) == '-') {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



	}

	public static int f(int n) {
		int c=0;
		String t=String.format("%0"+ String.valueOf(h+w) + "d", Long.parseLong(two(n)));
		for (int i=0; i<h;i++) {
			char inh = t.charAt(i);
			if (inh=='1') {
				continue;
			}
	    	for (int j=0; j<w; j++) {
	    		char inw = t.charAt(h+j);
	    		if (inw=='1') continue;
	    		if (S[i][j].equals("#")) c++;
	    	}
	    }
		return c;
	}

	public static String two(int n) {
		StringBuilder sb = new StringBuilder();
		if(n==0) return "0";
		while(n>0) {
			int k=n%2;
			sb.insert(0, k);
			if (k==0) {
				n=n/2;
			} else {
				n= (n-1) /2;
			}
		}

		return sb.toString();
	}

	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
	}

	// 文字列として入力を取得
	public static String gs() {
		return scanner.next();
	}

	// intとして入力を取得
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longとして入力を取得
	public static long gl() {
		return Long.parseLong(scanner.next());
	}

	// doubleとして入力を取得
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}