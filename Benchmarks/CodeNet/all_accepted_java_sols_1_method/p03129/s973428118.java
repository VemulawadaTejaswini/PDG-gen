import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(n % 2 == 1){
			if((n+1)/2 >= k){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		else{
			if(n/2 >= k){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
