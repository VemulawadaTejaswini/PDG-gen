
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int N=gi();


	    for(int n=1; n<=N;n++) {
	    	long c=0;
	        for(int x=1; x<=Math.sqrt(n);x++) {
	        	if(x*x+2*x>=n) break;
	    	    for(int y=x; y<=Math.sqrt(n);y++) {
	    	    	if(x*x+y*y+x*y+x+y>=n)break;
	    		    for(int z=y; z<=Math.sqrt(n);z++) {
                        if(x*x+y*y+z*z+x*y+y*z+z*x==n) {
                        	if (x==y && y==z) {
                        		c++;
                        	}else if((x==y && y!=z) || (y==z && x!=y)) {
                        		c+=3;
                        	} else {
                        		c+=6;
                        	}
                        	break;
                        }
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