import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int L[] = new int[N];
		int sum = 0;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
			sum += L[i];
			if(sum <= X) {
				ans++;
			}
		}
		
		System.out.println(++ans);
	}
}
