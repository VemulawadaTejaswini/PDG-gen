import java.util.Scanner;
 
public class Main {
 
	static Scanner scanner;
 
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
 
	    String s=gs();
	    //int r=gi();
	    //int c=gi();
 
	    //System.out.print(String.valueOf(c));
 
        if (s.charAt(0)==s.charAt(1) && s.charAt(1)== s.charAt(2)) {
        	System.out.print("No");
        }else {
        	System.out.print("Yes");
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