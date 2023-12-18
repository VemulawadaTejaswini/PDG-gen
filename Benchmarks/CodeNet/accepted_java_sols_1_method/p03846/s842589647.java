import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] times = new int[n];
    
        boolean isOdd = (n % 2 == 1);
        int num = 0;
        for(int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }
        Arrays.sort(times);
        
        if(times[0] != 0 && isOdd){
			System.out.println(0);
			return;
		}
		
        for(int i=n - 1; i>0; i-=2){
			if(times[i] != times[i-1]){
				System.out.println(0);
				return;
			}
		}
		
        long ans=1;
		for(int i=0; i<n/2; i++)ans = 2*ans%1000000007;
		System.out.println(ans);
    }
    
}
