import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    String nn=String.valueOf(n);
	    StringBuilder sb=new StringBuilder();
        for (int i=0; i< nn.length();i++) {
        	if (nn.charAt(i)=='1') {
        		sb.append('9');
        	} else if (nn.charAt(i)=='9') {
        		sb.append('1');
        	} else {
        		sb.append(nn.charAt(i));
        	}
        }
	    
        System.out.println(sb.toString());
//        if () {
//        	System.out.print("No");
//        }else {
//        	System.out.print("Yes");
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