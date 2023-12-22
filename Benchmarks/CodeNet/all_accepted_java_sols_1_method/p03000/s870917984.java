import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] L = new int[N];
		for(int i = 0; i < N; i++)
			L[i] = sc.nextInt();
		int d = 0, ans = 1;
		for(int i = 0; i < N; i++){
			d += L[i];
			if(d > X)
				break;
			ans++;
		}
		System.out.println(ans);

	}

}