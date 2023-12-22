
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    double M=gd();
	    double[] A=new double[N];
	    double s=0;
	    for (int i=0; i<N;i++) {
	    	A[i]=gd();
	    	s+=A[i];
	    }
	    Arrays.parallelSort(A);
	    double mm=s/(4*M);
	    boolean f=true;
	    for (int i=0; i<M;i++) {
	    	double a=A[A.length-i-1];
	    	if(a<mm) {
	    		f=false;
	    		break;
	    	}
	    }
	    //System.out.print(a*1000+b*5);
        if (f) {
    	    System.out.print("Yes");
        }else {
        	System.out.print("No");
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