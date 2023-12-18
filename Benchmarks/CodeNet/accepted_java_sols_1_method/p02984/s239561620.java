import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		long x = 0;
		long as = 0;
		long evena = 0;
		for(int i=0; i<n; i++){
			as += a[i];
			if(i%2!=0){
				evena += a[i];
			}
		}
		x = as - 2*evena;
		long ans[] = new long[n];
		ans[0] = x;
		for(int i=0; i<n-1; i++){
			ans[i+1] = (a[i]*2) - ans[i];
		}
		for(long i: ans){
			System.out.print(i + " ");
		}
	}
}
