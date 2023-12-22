import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int T = sc.nextInt();
    	int [] t = new int[N];
    	long X =0;
    	
    	for(int i=0; i<N; i++){
    	    t[i] = sc.nextInt();
    	}
    	
    	for(int i=0; i<N-1; i++){
    	    if(t[i+1]-t[i]<=T){
    	        X += t[i+1]-t[i];
    	    }
    	    else{
    	        X += T;
    	    }
    	
    	}
    	
    	System.out.println(X+T);
    	
    }
}