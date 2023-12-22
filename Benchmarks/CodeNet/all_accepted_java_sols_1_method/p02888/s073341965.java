import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int len[] = new int[N];
		for(int i = 0; i < N; i++){
			len[i] = sc.nextInt();
		}
		
		Arrays.sort(len);
		
		int result = 0;
		for(int a = 0; a < N - 2; a++){
			for(int b = a + 1; b < N - 1; b++){
				
				//b - a < c
				int ok = N;
				int ng = b;
				
				while(Math.abs(ok - ng) > 1){
					int mid = (ok + ng) / 2;
					if(len[b] - len[a] < len[mid]){
						ok = mid;
					}
					else{
						ng = mid;
					}
				}
				int cleft = ok;
				
				//c < a + b
				ok = b;
				ng = N;
				
				while(Math.abs(ok - ng) > 1){
					int mid = (ok + ng) / 2;
					if(len[mid] < len[a] + len[b]){
						ok = mid;
					}
					else{
						ng = mid;
					}
				}
				int cright = ok;
				result += Math.max(0, (cright - cleft+1));
			}
		}
		System.out.println(result);
	}
}