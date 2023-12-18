import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int nums[] = new int[2]; 
      	String str;
      
      	int stack;
      	boolean judge = true;
      	
      	for(int i = 0;i < 2; i++){
        	nums[i] = sc.nextInt();
        }
      

      	str = sc.next();
      	
          for(int i = 0; i < nums[0]; i++){
           	stack = (int)str.charAt(i);
            if(stack < 48 || 57 < stack) judge = false;
          }
          
          if(str.charAt(nums[0]) != '-') judge = false;
     
          for(int i = nums[0] + 1; i < nums[0] + nums[1] + 1; i++){
            stack = (int)str.charAt(i);
            if(stack < 48 || 57 < stack) judge = false;
          }
          if(judge) System.out.println("Yes");
          else System.out.println("No");
	}
}
