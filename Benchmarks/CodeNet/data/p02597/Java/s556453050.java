
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        long N=gl();
        String wr=gs();
        
        int wn=0;
        int rn=0;
        for (int i=0; i<N; i++) {
        	char c=wr.charAt(i);
        	if(c=='W') {
        		wn++;
        	} else {
        		rn++;
        	}
        }
        
        long ans=Math.min(wn, rn);
        
        long ans2=0;
        for (int i=0; i<rn; i++) {
        	char c=wr.charAt(i);
        	if(c=='W') {
        		ans2++;
        	}
        }
        
        System.out.println(Math.min(ans,  ans2));

//        if(K%2==0) {
//
//		    System.out.println(-1);
//        } else {
//        	System.out.println("No");
//
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