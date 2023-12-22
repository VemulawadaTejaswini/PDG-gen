
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String S=gs();
       int c=0;
       int i=0;
       int e=S.length()-1-i;
        while(i<e) {
        	if(S.charAt(i) != S.charAt(e)) {
        		c++;
        	} 
        	i++;
        	e=S.length()-1-i;
        }


        System.out.print(c);

//        if (N%2==0 && s.substring(0, N/2).equals(s.substring(N/2))) {
//        	System.out.println("Yes");
//        }else{
//        	System.out.println("No");
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