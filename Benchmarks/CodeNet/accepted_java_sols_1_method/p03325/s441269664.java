import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long a[] = new long[n];
		int ans = 0;
		
		for(int i=0;i<n;i++){
		    a[i] = sc.nextLong();
		    for(long j=0; j<n; j++){
		        if(a[i]%2==0){
		            a[i] = a[i]/2;
		            ans++;
		        }
		    }
		}
		
        System.out.println(ans);
	}
}
