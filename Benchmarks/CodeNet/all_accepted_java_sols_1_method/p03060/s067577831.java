import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int[] v = new int[N];
		int[] c = new int[N];
		for(int i = 0; i < N; i++)
			v[i] = sc.nextInt();
		for(int i = 0; i < N; i++)
			c[i] = sc.nextInt();
		for(int i = 0; i < N; i++)
			if(v[i]>c[i])
				ans += (v[i]-c[i]);
		System.out.println(ans);
	}

}