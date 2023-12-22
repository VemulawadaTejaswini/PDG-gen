import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N];
		int ans = 1;
		for(int i = 0;i < N;i++){
			P[i] = sc.nextInt();
		}
		for(int i = 1;i < N;i++){
			if(P[i - 1] >= P[i]){
				ans++;
			}else{
				P[i] = P[i - 1];
			}
		}
		System.out.println(ans);
	}
}