
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
        int[] V=new int[N];
        int[] C=new int[N];
        for (int i=0; i<N; i++) {
        	V[i]=gi();
        }
        for (int i=0; i<N; i++) {
        	C[i]=gi();
        }
        int v=0;
        for (int i=0; i<N; i++) {
        	if(V[i]-C[i]>0)v+=(V[i]-C[i]);
        }
        
        


        System.out.print(v);

//        if (s>L[n-2]) {
//        	System.out.println("Yes");
//        }else {
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