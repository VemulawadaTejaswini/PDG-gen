import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException{
		ArrayList<Integer> S =new ArrayList<Integer>();
		int T;
	    int n,q;
	    int C = 0;

	    Scanner scan = new Scanner(System.in);
	    
	    n = scan.nextInt();
	    for(int i=0; i<n ;i++){
	    	S.add(scan.nextInt());
	    }

	    q = scan.nextInt();
	    for(int i=0; i<q ;i++){
	    	T = scan.nextInt();
	    	if(S.contains(T)){
	    		C++;
	    	}
	    	
	    }
	    System.out.println(C);
	    scan.close();
	}
}