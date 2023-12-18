
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

        long N=gl();
        long D=gl();
        
        long ans=0;
        for (int i=0; i<N;i++) {
        	double x=gd();
        	double y=gd();
        	double d=Math.sqrt(x*x+y*y);
        	if(d<=D) {
        		ans++;
        	}
        	
        }

        System.out.println(ans);
//
//        if(N>=30) {
//
//		    System.out.println("Yes");
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