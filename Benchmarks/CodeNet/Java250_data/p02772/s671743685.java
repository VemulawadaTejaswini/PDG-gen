
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] A=new int[N];
	    boolean f=true;
	    for(int i=0; i<N;i++) {
	    	A[i]=gi();
	    	if(A[i]%2==0 && A[i]%3!=0 && A[i]%5!=0)f=false;
	    }	    
	    
       // System.out.print(sb.toString());

        if (f) {
    	    System.out.print("APPROVED");
        }else{
        	 System.out.print("DENIED");
        }
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