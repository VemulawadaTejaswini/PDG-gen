
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    long[] A=new long[N];
	    Map<Long, Integer> m=new HashMap<Long, Integer>();
	    
	    
	    for (int i=0; i<N; i++) {
	    	A[i]=gl();
	    	if(m.containsKey(A[i])) {
	    		System.out.print("NO");
              return;
	    	} else {
	    		m.put(A[i],1);
	    	}
	    }

        System.out.print("YES");
//        if (s.charAt(0)=='0' && N!=1) {
//        	System.out.println(-1);
//        }else {
//        	System.out.println(s);
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