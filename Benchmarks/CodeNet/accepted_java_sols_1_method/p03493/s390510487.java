import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	
      	String numStr = sc.next();
      	String[] nums = numStr.split("");
      
      	int count = 0;
      	for (int i = 0; i < nums.length; i++){
        	if("1".equals(nums[i])){
            	count++;
            }
        }
      	System.out.println(count);
    }
}