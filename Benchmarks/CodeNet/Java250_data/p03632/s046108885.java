
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    //String s=gs();
	    int a=gi();
	    int b=gi();
	    int c=gi();
	    int d=gi();
	    
	    //System.out.print(String.valueOf(s.charAt(0))+ (s.length()-2)+s.charAt(s.length()-1));

	    if (b<=c || d<=a) {
        	System.out.print(0);
        }else if(a<=c && b<=d){
        	System.out.print(b-c);
        } else if (c<=a && d<=b) {
        	System.out.print(d-a);
        } else {
        	System.out.print(Math.min(b-a, d-c));
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