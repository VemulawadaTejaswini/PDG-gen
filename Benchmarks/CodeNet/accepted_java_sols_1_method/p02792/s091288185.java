import java.util.*;
 
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] cnt = new int[100];
		
		for(int i=1;i<=n;i++){
			if(i<10)
				cnt[i*10+i]++;
			else{
				int q = i;
				while(q>=10){
					q/=10;
				}
				int r = i%10;
				
				cnt[q*10+r]++;
			}
		}
		
		int ans = 0;
		for(int i=11;i<=99;i++){
			int q = i/10;
			int r = i%10;
			
			if(q!=0 && r!=0){
				ans += cnt[q*10+r]*cnt[r*10+q];
			}
		}
		
		System.out.println(ans);
	}
}