import java.util.*;
public class Main{
	public static void main(String[] args){
		long ans = 0;
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		for(int i=1; i<=Math.sqrt(n); i++){
			if(n % i == 0 && n/i-i > 1){
				ans += n/i-1;
			}
		}
		
		System.out.println(ans);
	}
}
