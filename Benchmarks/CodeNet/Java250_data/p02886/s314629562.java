
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();
	    int[] D=new int[N];
	    int s=0;
	  for (int i=0; i<N;i++) {
	    	D[i]=gi();
	    }  
      
      for (int i=0; i<N;i++) {
	    	for (int j=i+1; j<N;j++) {
		    	s+=D[i]*D[j];
		    }
	    }



        System.out.print(s);

//        if (m%2==0) {
//        	System.out.println(m/2);
//        }else{
//        	System.out.println((m+1)/2);
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