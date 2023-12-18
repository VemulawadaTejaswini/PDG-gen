import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
 
public class Main{
	
	public static boolean is_leading_zero(String str){
		if(str.length() == 0){
			return false;
		}else{
			return str.charAt(0) == '0';
		}
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	
    	final int a = sc.nextInt();
    	
    	String input = Integer.toString(a);
    	
    	int count = 0;
    	for(int pos = 0; pos <= input.length(); pos++){
    		String fst = input.substring(0, pos);
    		String snd = input.substring(pos);
    		
    		if(is_leading_zero(fst) || is_leading_zero(snd)){
    			continue;
    		}
    		
    		if(fst.equals("")){
    			fst = "0";
    		}
    		if(snd.equals("")){
    			snd = "0";
    		}
    		
    		final int sub = Integer.parseInt(fst);
    		final int add = Integer.parseInt(snd);
    		
    		if((add + sub) % 2 != 0){
    			continue;
    		}
    		final int x = (add + sub) / 2;
    		final int y = add - x;
    		
    		if(x < 0 || y < 0){
    			continue;
    		}
    		
    		//System.out.println(x + " : " + y);
    		
    		count++;
    	}
    	System.out.println(count);
    }
     
}