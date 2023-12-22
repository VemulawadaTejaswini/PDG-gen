import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  		
      	int n = sc.nextInt();
      	int stack;
      	List<Integer> nums = new ArrayList<Integer>();
      	int num = 1;
      
      	for(int i = 0;i < n;i++){
          	stack = sc.nextInt();
        	if(stack == num) {
              nums.add(stack);
              num++;
            }
        }
      	
      	if(num == 1)System.out.println(-1);
      	else System.out.println(n - nums.size());
        
	}
}
