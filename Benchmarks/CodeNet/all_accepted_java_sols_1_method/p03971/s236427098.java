//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String input = sc.next();
		//char in[] = new char[N];
	    char in[] = input.toCharArray();
	    
	    for(int i=0;i<N;i++) {
	   // System.out.println(in[i]);
	    }
	    int count = 0;
	    int countB = 0;
	    int countbatu = 0;
	    
	    for(int j=0;j<N;j++) {
	    	if(in[j] == 'c') {
	    		System.out.println("No");
	    	}
	    	if(in[j] == 'a') {
	    		count ++;
	    		if(countB>B) {
	    			if(count<A+B+1+(countB-B)) {
	    				System.out.println("Yes");
	    			}else {
	    				System.out.println("No");
	    			}
	    		}
	    		if(countB<=B) {
	    			if(count<A+B+1) {
	    				System.out.println("Yes");
	    			}else {
	    				System.out.println("No");
	    			}
	    		}
	    	}
	    	if(in[j] == 'b') {
	    		count ++;
	    		countB ++;
	    		if(count<A+B+1&&countB<B+1) {
	    			System.out.println("Yes");
	    		}else {
	    			System.out.println("No");
	    		}
	    	}
	    
	    }
	}
	    
}


