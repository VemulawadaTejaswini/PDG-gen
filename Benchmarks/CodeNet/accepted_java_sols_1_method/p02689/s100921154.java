import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] H = new long[N];
		int ans = N;
		boolean[] flg = new boolean[N];
		for(int i = 0;i < N;i++){
			H[i] = sc.nextLong();
		}
		
		for(int i = 0;i < M;i++){
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			if(H[A] > H[B]){
				flg[B] = true;
			}else if(H[A] < H[B]){
				flg[A] = true;
			}else{
				flg[A] = true;
				flg[B] = true;
			}
		}
		
		for(int i = 0;i < N;i++){
			if(flg[i]){
				ans--;
			}
		}
		System.out.println(ans);
	}
}