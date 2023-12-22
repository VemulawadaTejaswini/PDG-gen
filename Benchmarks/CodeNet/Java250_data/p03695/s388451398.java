
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] A=new int[N];
	    boolean[] f=new boolean[9];
	    int c=0;
	    for (int i=0; i<N;i++) {
	    	A[i]=gi();
	    	f[Math.min(Math.floorDiv(A[i], 400), 8)]=true;
	    	if(A[i]>=3200) c++;
	    }
	    
	    int min=0;
	    for (int i=0; i<8;i++) {
	    	if(f[i])min++;
	    }
	    int max=min+c;
	    if(min==0)min++;

       System.out.print(min + " " + max);
//
//        if (f) {
//    	    System.out.print("Yes");
//        }else{
//        	 System.out.print("No");
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