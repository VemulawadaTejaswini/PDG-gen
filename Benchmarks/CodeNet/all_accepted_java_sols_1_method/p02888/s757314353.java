import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		for(int i = 0; i < N; i++)
			L[i] = sc.nextInt();
		Arrays.sort(L);
		long ans = 0;
		for(int i = N-1; i >= 0; i--) {
			for(int j = i-1; j >= 0; j--) {
				for(int k = j-1; k >= 0; k--) {
					if(L[j]+L[k]>L[i])
						ans++;
					else
						break;
				}
			}
		}
		System.out.println(ans);

	}

}
