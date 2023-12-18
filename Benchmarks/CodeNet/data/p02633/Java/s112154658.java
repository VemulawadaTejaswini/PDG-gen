
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int x=gi();
	    int m= uclid(360,x);
//	    if (k>k2) {
//	    	System.out.println("NO");
//	    } else {
//	    	System.out.println("YES");
//	    }
	    System.out.println(x/m);
	}

	// s進数で表した時の桁数
    public static int uclid(int m, int n) {
    	if (m<n) {
			m^=n;
			n^=m;
			m^=n;
		}

		while(true) {
			int t=m%n;
			if (t==0) {
				return n;
			} else {
				m=n;
				n=t;
			}
		}
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