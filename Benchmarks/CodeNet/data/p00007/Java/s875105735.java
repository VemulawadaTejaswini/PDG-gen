import java.util.*;
 
public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = 100000;
		for(int i=0;i<n;i++){
			ans *= 1.05;
		}
		int r = ans % 10000;
		
		ans = ans / 10000 * 10000;
		if(r > 0){
			ans += 10000;
		}
		System.out.println(ans);
	}
	
	
}