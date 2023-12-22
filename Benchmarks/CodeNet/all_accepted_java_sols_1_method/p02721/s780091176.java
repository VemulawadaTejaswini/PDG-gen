import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int C = sc.nextInt();
		char[] s = sc.next().toCharArray();
		int[] L = new int[N], R = new int[N];
		int wait = C, sum = 0;
		for(int i = 0; i < N; i++) {
			if(wait >= C) {
				if(s[i] == 'o') {
					wait = -1;
					L[sum] = i;
					sum++;
				}
			}
			wait++;
			if(sum == K)
				break;
		}
		boolean l = false;
		wait = C; sum = K;
		for(int i = N-1; i >= 0; i--) {
			if(s[i] == 'o')
				l = true;
			if(!l)
				continue;
			if(wait >= C) {
				if(s[i] == 'o') {
					wait = -1;
					sum--;
					R[sum] = i;
				}
			}
			wait++;
			if(sum == 0)
				break;
		}
		for(int i = 0; i < K; i++)
			if(L[i] == R[i])
				System.out.println(L[i]+1);
	}
}