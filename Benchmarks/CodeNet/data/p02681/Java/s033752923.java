import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    //int k=gi();
        String s=gs();
        String t=gs();
        

	    //System.out.print(nr*2*Math.PI);
	    if (s.equals(t.substring(0, t.length()-1))) {
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