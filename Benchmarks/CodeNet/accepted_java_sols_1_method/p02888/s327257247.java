import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L[] = new int[N];
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
		
		long ans = 0;
		Arrays.sort(L);
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					if(L[i] + L[j] > L[k]) {
						ans++;
					} else {
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
