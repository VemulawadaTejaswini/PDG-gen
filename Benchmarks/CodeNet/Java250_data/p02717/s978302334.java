
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    //String s=gs();
	    int x=gi();
	    int y=gi();
	    int z=gi();
	    
	    System.out.print(z+" "+x+" "+y);

//	    if (s.charAt(2)==s.charAt(3) && s.charAt(4)== s.charAt(5)) {
//        	System.out.print("Yes");
//        }else {
//        	System.out.print("No");
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