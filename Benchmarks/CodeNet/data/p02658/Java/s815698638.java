import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int n = sc.nextInt();
      	long nums[] = new long[n];
      	long ans = 1;
      	boolean con = true;
      	long zero = 0; 
      	long limit = 1000000000;
      	limit *= 1000000000;
      	for(int i = 0;i < n; i++) {
          nums[i] = sc.nextLong();
          if(nums[i] == 0) ans = 0; 
        }
      
      	for(int i = 0;i < n && con; i++) {
      		ans *= nums[i];
      		if(ans > limit) con = false;
        }
      
      	if(con) System.out.println(ans);
      	else System.out.println("-1");
        
	}
}
