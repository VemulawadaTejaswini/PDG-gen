import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);
	    String s=gs();
	    String t=gs();
	    int c=0;
	    for (int i=0; i<3;i++) {
	    	if(s.charAt(i)==t.charAt(i))c++;
	    }

	   
	    System.out.print(c);

//        if (a>=3200) {
//        	System.out.print(s);
//        }else {
//        	System.out.print("red");
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