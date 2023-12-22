import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		boolean[] sunuke = new boolean[N];
		for(int i = 0;i < K;i++){
			int d = sc.nextInt();
			for(int j = 0;j < d;j++){
				int A = sc.nextInt() - 1;
				sunuke[A] = true;
				
			}
		}
		for(int i = 0;i < N;i++){
			if(sunuke[i] == false){
				ans++;
			}
		}
		System.out.println(ans);
	}
}