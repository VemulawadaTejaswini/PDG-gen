
import java.util.Scanner;

public class Main {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int K=gi();
	    int[] A=new int[N];
	    for (int i=0; i<N;i++) {
	    	A[i]=gi();
	    }
	    
	    for (int i=K; i<N;i++) {
	    	int b=A[i-K];
	    	int a=A[i];
	    	if(b<a) {
	    		System.out.println("Yes");
	    	} else {
	    		System.out.println("No");
	    	}
	    }

//
//	    if(A<B && B<C) {
//	        System.out.println("Yes");
//	    } else {
//	    	System.out.println("No");
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