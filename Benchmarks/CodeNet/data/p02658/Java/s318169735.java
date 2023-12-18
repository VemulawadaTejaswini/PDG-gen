import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long A = new int[N];
		
		for(int i; i < N; ++i){
		    A[i] = sc.nextLong();
		}
		for(int i; i < N; i++){
		    if(A[i] < (long)Math.pow(10,18)){
		        int ans *= A[i];
		    }else{
		        ans = -1;
		    }
		}
		System.out.println(ans);
	}
}