import java.util.LinkedList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        Scanner as = new Scanner(System.in);
        int T[];
        int n,q;
        int C = 0;
        String test="";
        
        n = Integer.parseInt(as.next());
        T = new int[n];
        
        for(int i=0;i<n;i++){
        	
        	 sb.append(":").append(Integer.parseInt(as.next())).append(":");
        	
        }
        
        q = Integer.parseInt(as.next());
        
        for(int i=0;i<q;i++){
        	
        	
        	if(sb.indexOf(test = ":"+as.next()+":") != -1){
        		
        		//System.out.println(test);
        		C++;
        		
        	}
        	
        }
        
        sb.setLength(0);
        sb.append(String.valueOf(C));
        System.out.println(sb);
       
	}

}