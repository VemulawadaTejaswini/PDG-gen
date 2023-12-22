
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        int N=gi();
        Map<String, Integer> m=new HashMap<String, Integer>();
        String b=gs();
        m.put(b, 1);
        for (int i=1; i<N; i++) {
        	String w=gs();
        	if (m.containsKey(w)) {
        		System.out.println("No");
        		return;
        	}
        	if (b.charAt(b.length()-1)!=w.charAt(0)) {
        		System.out.println("No");
        		return;
        	}
          m.put(w,1);
        	b=w;
        }


        System.out.println("Yes");
//        if (a>0) {
//        	System.out.println("Yes");
//        }else {
//        	System.out.println("No");
//        }
	}


	public static long d(long n) {
		String a=String.valueOf(n);
		return (long)a.length();
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