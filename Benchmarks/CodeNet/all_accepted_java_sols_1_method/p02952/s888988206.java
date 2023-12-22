import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int count = 0;
		
	    int valLen = String.valueOf( a ).length();    //桁数
	    
	    for(int i = valLen; i > 0; i--){
	        
	        if(i % 2 == 1){
	            
	            if(i == valLen)
	            {
	                count += a % Math.pow(10, i-1) + 1;
	                count +=  ( (a / (int)Math.pow(10, i-1) ) - 1) * (int)Math.pow(10, i-1);
    	        }
    	        else if(i == 1)
    	        {
    	            count += 9;
    	        }
    	        else
    	        {
    	            count += 9*(int)Math.pow(10, i-1);
    	        }
	                
	        }
	        
	    }
	    
        System.out.println(count);
	}
}