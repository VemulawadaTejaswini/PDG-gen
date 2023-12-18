import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		long ans = 1;
		for(int i = 0;i < N;i++){
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		for(int i = 0;i < N;i++){
			if(A[i] == 0){
				ans = 0;
				break;
			}else if(A[i] <= 1000000000000000000L / ans){
				ans *= A[i];
			}else{
				ans = -1;
				break;
			}
		}
		if(ans > 1000000000000000000L){
			ans = -1;
		}
		System.out.println(ans);
	}
}