import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N+1];
		for(int i = 1;i <= N;i++){
			P[i] = sc.nextInt();
		}
		sc.close();
		int ans = 1;
		int min = P[1];
		for(int i = 2;i <= N;i++){
			min = Math.min(min, P[i]);
			if(P[i] <= min){
				ans++;
			}
		}
		System.out.println(ans);
	}
}