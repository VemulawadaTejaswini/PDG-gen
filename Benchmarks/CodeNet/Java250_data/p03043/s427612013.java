
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    double N=gd();
	    double K=gd();
	    
	    double s=0;
	    for (double i=1; i<=N; i++) {
            if(i>=K){
                s+=1/N;
                continue;
            }
	    	double x=Math.ceil(Math.log(K/i)/Math.log(2));
	    	double y=Math.pow(2, x)*N;
	    	s+=1/y;
	    }
	    

        System.out.println(s);
//	    if(max>s-max) {
//	    	System.out.println(s-max-1);
//	    }
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