import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception{
	
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
 
    int ans = A+B;
    ans = ans < A-B ? A-B : ans;
    ans = ans < A*B ? A*B : ans;
    
    System.out.print(ans);
 
      
	}
} 
