import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] L = new int[N+1];
		L[0] = 0;
		for(int i=1; i<=N; i++) {
			L[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int dis = 0;
		for(int i=0; i<=N; i++) {
			dis += L[i];
			if(X>=dis) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

