
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String A=gs();
	    String B=gs();
	    String C=gs();

	    int a=0;
	    int b=1;
	    int c=2;
	    int t=a;
	    int ai=0;
	    int bi=0;
	    int ci=0;
	    while(true) {
	        if (t==a) {
	        	t=A.charAt(ai) - 97;
	        	ai++;
	        }else if (t==b) {
	        	t=B.charAt(bi) - 97;
	        	bi++;
	        } else if (t==c) {
	        	t=C.charAt(ci)-97;
	        	ci++;
	        }
	        
	        if (t==a && ai==A.length()) {
	        	System.out.print("A");
	        	return;
	        }else if (t==b && bi==B.length()) {
	        	System.out.print("B");
	        	return;
	        }else if (t==c && ci==C.length()) {
	        	System.out.print("C");
	        	return;
	        }
	    }
//        if (a<=c&&c<=b) {
//        	System.out.print("Yes");
//        }else{
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
}