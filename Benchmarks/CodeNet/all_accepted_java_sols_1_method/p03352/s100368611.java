import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int num = sc.nextInt(); 
      	int stack;
      	int ans = 1;
      	
      	for(int i = 2; i <= 32; i++){
          	stack  = i;
        	while(stack*i <= num) {
              stack *= i;
          	  if(stack > ans) ans = stack;
            }
        }
      	
      	System.out.println(ans);
        
	}
}
