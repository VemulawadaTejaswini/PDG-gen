import java.util.*;
 
public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = 100000;
		for(int i=0;i<n;i++){
			ans *= 1.05;
			if(ans%1000>0){
				ans = ((ans/1000)+1) * 1000;
			}
		}
		cout(ans);
	}
	
	
	
	public static void cout(int n){
		System.out.println(n);
	}
}