import java.util.Scanner;
 
 
public class Main{
	
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	String input = sc.next();
    	
    	
    	int old = 0;
    	int best_old = Integer.MIN_VALUE;
    	String ans = "";
    	String prev = "";
    	while(!input.equals("")){
    		//System.out.println(prev + " " + ans);
    		if(input.startsWith("egg")){
    			if(prev.equals("egg")){
    				if(best_old < old){
    					best_old = old;
    					ans = "egg";
    				}
    				
    				old = 1;
    			}else{
    				old++;
    			}
    			
    			prev = "egg";
    			input = input.substring("egg".length());
    		}else if(input.startsWith("chicken")){
    			if(prev.equals("chicken")){
        			if(best_old < old){
        				best_old = old;
        				ans = "chicken";
        			}
        				
    				ans = "chicken";
    				old = 1;
    			}else{
    				old++;
    			}
    			
    			prev = "chicken";
    			input = input.substring("chicken".length());
    		}	
    	}
    	
    	if(best_old < old){
    		ans = prev;
    	}
    	
    	System.out.println(ans);
    	
    }
     
}