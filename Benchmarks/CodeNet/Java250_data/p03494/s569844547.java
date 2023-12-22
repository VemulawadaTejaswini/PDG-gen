
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int n=gi();
	    int[] A= new int[n];
	    int f=0;
	    for(int i=0; i<A.length;i++) {
    		A[i]=gi();
    	}
	    while(true) {
	    	boolean flg=true;
	    	for(int i=0; i<A.length;i++) {
	    		if(A[i]%2!=0) {
	    			flg=false;
	    			break;
	    		}else {
	    			A[i]=A[i]/2;
	    		}
	    	}
	    	if(!flg) {
	    		break;
	    	}
	    	f++;
	    }
	    System.out.print(f);
//	    if (n%f==0) {
//	    	System.out.print("Yes");
//	    }else {
//	    	System.out.print("No");
//	    }



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