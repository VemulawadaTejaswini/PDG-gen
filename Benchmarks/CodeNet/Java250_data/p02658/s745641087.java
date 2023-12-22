import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long ans = 1;
		long max = (long)Math.pow(10,18);
		
		for(int i=0; i<n; i++){
		    a[i]=sc.nextLong();
		    if(a[i]==0){
		        System.out.println(0);
		        return;
		    }
		}
		
		if(ans != 0){
		    for(int i=0; i<n; i++){
		        if(max/ans <a[i]){
		            System.out.println(-1);
		            return;
		        }else{
		            ans = ans*a[i];
		        }
		    }
		}
		
		System.out.println(ans);
	}
}
