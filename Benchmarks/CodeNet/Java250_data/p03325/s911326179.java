import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
  		long nums[] = new long[s]; 
      	long stack_num;
      	long pos = 0;
      	
      	for(int i = 0;i < s; i++){
        	nums[i] = sc.nextLong();
        }
      
      	for(long num: nums){
          while(num % 2 == 0){
            num /= 2;
            pos++;
          }
        }
 		
      	System.out.println(pos);
        
	}
}
