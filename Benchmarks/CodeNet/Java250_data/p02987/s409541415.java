import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String x=gs();
	   
	    //System.out.print(P[1]+P[0]);

        if ((x.charAt(0)==x.charAt(1) && x.charAt(2)==x.charAt(3) && x.charAt(0)!=x.charAt(2))
        || (x.charAt(0)==x.charAt(2) && x.charAt(1)==x.charAt(3) && x.charAt(0)!=x.charAt(1))
        || (x.charAt(0)==x.charAt(3) && x.charAt(2)==x.charAt(1) && x.charAt(0)!=x.charAt(2))) {
        	System.out.print("Yes");
        }else {
        	System.out.print("No");
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