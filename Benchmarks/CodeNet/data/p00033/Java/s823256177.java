import java.util.Scanner;


public class Main {

	private static final boolean SUCCESS = true,
	                             FAILURE = false;


    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in).useDelimiter(System.getProperty("line.separator"));
    	int n = sc.nextInt();

    	String[] s;
    	boolean flg;
    	int      A = 0,
    	         B = 0,
    		     C = 0;
    	for(int i=0;i<n;i++){
    		s = sc.next().split("\\s");

    		flg = SUCCESS;
    		for(int j=0;j<10;j++){
    			A = Integer.parseInt(s[j]);
    			if      (B < A){B = A;}
    			else if (C < A){C = A;}
    			else           {flg = FAILURE;
    			                break;        }
   			}
    		if   (flg){System.out.println("YES");}
    		else      {System.out.println("NO"); }
    	}
    }
}