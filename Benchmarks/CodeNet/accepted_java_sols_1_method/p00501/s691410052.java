import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 	int n =sc.nextInt();
	 	char[] w = sc.next().toCharArray();
	 	String[]sign=new String[n];
	 	boolean[] board = new boolean[n];
	 	int count=0;
	 	for(int i=0; i<n; i++){
	 		sign[i] = sc.next();
	 		}
	    for(int i=0; i<100; i++){
	    	for(int k=0; k<n; k++){
	    		if(board[k]){ continue;}
	            char[] c = sign[k].toCharArray();
	            for(int l=0; l<c.length; l++){
	                for(int j=0; j<w.length; j++){
	                int idx = i * j + j + l;
	                if(idx>=c.length) break;
	                if(c[idx]!=w[j]) break;
	                if(j==w.length-1) board[k] = true;
	                }
	                if(board[k]) break;
	            }	
	    	}
	    	}
	    for(int i=0; i<board.length; i++){
	        if(board[i]) count++;
	    }
	 
	    System.out.println(count);
	    }

	 	
}