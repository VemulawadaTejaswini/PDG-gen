import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
      	long d = sc.nextLong();
      	d *= d;
      	long stack1;
      	long stack2;
      	int count = 0;
      	
      	for(int i = 0;i < n;i++){
        	stack1 = sc.nextInt();
          	stack2 = sc.nextInt();
          	if(stack1*stack1 + stack2*stack2 <= d) count++;
        }
      
        System.out.println(count);
            	
        
	}
}