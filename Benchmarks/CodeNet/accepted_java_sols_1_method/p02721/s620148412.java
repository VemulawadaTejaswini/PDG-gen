import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int C = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] L = new int[N], R = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(s[i] == 'o') {
				L[sum] = i;
				sum++;
				i += C;
			}
			if(sum == K)
				break;
		}
		for(int i = N-1; i >= 0; i--) {
			if(s[i] == 'o') {
				sum--;
				R[sum] = i;
				i -= C;
			}
			if(sum == 0)
				break;
		}
		for(int i = 0; i < K; i++)
			if(L[i] == R[i])
				System.out.println(L[i]+1);
	}
}
