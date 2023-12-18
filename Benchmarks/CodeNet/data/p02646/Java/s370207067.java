import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long A=gl();
	    long V=gl();
	    long B=gl();
	    long W=gl();
	    long T=gl();
	    
	    long k=Math.abs(A-B);
	    long v=V-W;
	    long k2=v*T;
	    if (k>k2) {
	    	System.out.println("NO");
	    } else {
	    	System.out.println("YES");
	    }
	    //System.out.println(min);
	}

	// s進数で表した時の桁数
	public static int NsinKeta(int n, int s) {
		if(n==0) return 1;

		int i=0;
		while(n!=0) {
			n=Math.floorDiv(n, s);
			i++;
		}

		return i;
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