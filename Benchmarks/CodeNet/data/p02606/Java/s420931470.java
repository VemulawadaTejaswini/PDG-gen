
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int L=gi();
	    int R=gi();
	    int d=gi();
	    
	    int c=0;
	    for(int i=L; i<=R;i++) {
	    	if (i%d==0) {
	    		c++;
	    	}
	    }

	    
        System.out.print(c);

//        if (m%2==0) {
//        	System.out.println(m/2);
//        }else{
//        	System.out.println((m+1)/2);
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