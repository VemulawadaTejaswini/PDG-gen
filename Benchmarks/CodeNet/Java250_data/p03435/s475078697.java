
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    int[][] C=new int[3][3];
	    int[] A =new int[3];
	    int[] B =new int[3];
	    
	    for (int i=0; i<3; i++) {
	    	for (int j=0; j<3; j++) {
                C[i][j]=gi();
		    }
	    }
	    for (A[0]=0; A[0]<=C[0][0]; A[0]++) {
	    	B[0]=C[0][0]-A[0];
	    	for (A[1]=0; A[1]<=C[1][1]; A[1]++) {
	    		B[1]=C[1][1]-A[1];
	    		for (A[2]=0; A[2]<=C[2][2]; A[2]++) {
	    			B[2]=C[2][2]-A[2];
	    			boolean f=true;
	    			for (int i=0; i<3;i++) {
	    				for (int j=0; j<3;j++) {
		    				if(A[i]+B[j]!=C[i][j]) {
		    					f=false;
		    					break;
		    				}
		    			}
	    			}
	    			if(f) {
	    				System.out.println("Yes");
	    				return;
	    			}
	    	    }
		    }
	    }
	    System.out.println("No");
//        if (f) {
//    	    String a=Sq.substring(0, S.lastIndexOf(T)) + T + Sq.substring(S.lastIndexOf(T)+T.length());
//    	    System.out.print(a.replaceAll("\\?", "a"));
//        }else {
//        	System.out.print("UNRESTORABLE");
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