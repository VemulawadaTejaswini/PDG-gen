import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] L = new int[N];

		for (int i=0; i < N; i++){
			L[i] = sc.nextInt();
		}

		Arrays.sort(L);
		int ans=0;
		for (int i=0; i < N - 2; i++){
			for (int j=i+1; j < N-1; j++){
				int minus = L[j] - L[i];
				int plus = L[i] + L[j];
				for (int k=j+1; k < N; k++){
					if (L[k] >= plus){
						break;
					}
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}