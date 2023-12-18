
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();


	    for(int n=1; n<=N;n++) {
	    	long c=0;
	        for(int x=1; x<=n;x++) {
	        	if(x*x+2*x>=n) break;
	    	    for(int y=1; y<=n;y++) {
	    	    	if(x*x+y*y+x*y+x+y>=n)break;
	    		    for(int z=1; z<=n;z++) {
                        if(x*x+y*y+z*z+x*y+y*z+z*x==n)c++;
	    	        }
		        }
	        }
	        System.out.println(c);
	    }


        //System.out.print(c);

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