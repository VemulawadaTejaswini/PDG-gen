import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    long A=gl();
	    long B=Math.round(gd()*100);
	    long ab=A*B;
	    String s= String.valueOf(ab);

	    if (s.length()<=2) {
	    	System.out.print("0");
	    	return;
	    }
	    for (int i=0; i<s.length()-2;i++) {
            System.out.print(s.charAt(i));
	    }
//        if (flg) {
//        	System.out.print("YES");
//        }else {
//        	System.out.print("NO");
//        }


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