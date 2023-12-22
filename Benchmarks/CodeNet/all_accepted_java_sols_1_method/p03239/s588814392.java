import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
		int T = sc.nextInt();
		int [] c = new int [N];
		int [] t = new int [N];
	    
		for(int i =0; i<N; i++){
		    c[i] = sc.nextInt();
		    t[i] = sc.nextInt();
		}
		
		int min =0;
		boolean set = false;
		
		for(int i=0; i<N; i++){
		if(t[i]<=T){
		    if(set == false){
		        min = c[i];
		        set = true;
		    }
		    else if(min>c[i]){
		        min = c[i];
		    }
		}
		}
		
		if(set == false){
		    System.out.println("TLE");
		}
		else{
		System.out.println(min);
		}
 	}
}