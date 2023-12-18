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
		        ans = 0;
		        System.out.println(ans);
		        return;
		    }
		}
		
		for(int i=0; i<n; i++){
		    ans = ans*a[i];
		    if(ans > max){
		        ans = -1;
		        System.out.println(ans);
		        return;
		    }
		}
		
		System.out.println(ans);
	}
}
