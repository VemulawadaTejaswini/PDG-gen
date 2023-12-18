import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		for(int i = 0; i < N; i++)
			d[i] = sc.nextInt();
		Arrays.sort(d);
		int ans = d[N/2] - d[N/2-1];
		System.out.println(ans <= 0 ? 0 : ans);

	}

}
