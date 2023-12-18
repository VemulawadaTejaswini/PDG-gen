import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long A[] = new long[N];
		
		for(int i; i < N; ++i){
		    A[i] = sc.nextLong();
		}
		long ans = 0;
		for(int i; i < N; ++i){
		    if(A[i] < (long)Math.pow(10,18)/ans){
		        ans *= A[i];
		    }else{
		        ans = -1;
		    }
		}
		System.out.println(ans);
	}
}