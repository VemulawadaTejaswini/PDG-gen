import java.util.ArrayList;
import java.util.Scanner;
public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long ans=0;
		for(long i =1;i<=N;i++ ) {
			if(i%3==0 &&i%5==0) {
				
			}else  if(i%3==0 ||i%5==0) {
				
			}else {
				ans = ans+i;
			}
		}
		System.out.println(ans);
		
		
	}
	
}
