import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int N = sc.nextInt();
		char[] elems = sc.next().toCharArray();
		int[] acumW = new int[N];
		int[] acumE = new int[N];
		for (int i = 0; i < N; i++) {
			acumW[i] = elems[i] == 'W'? 1 : 0;
			if (i > 0) acumW[i] += acumW[i-1];
		}
		for (int i = N - 1; i >= 0 ; i--) {
			acumE[i] = elems[i] == 'E'? 1 : 0;
			if (i + 1 < N) acumE[i] += acumE[i+1];
		}
		int ans = N;
		for (int i = 0; i < N; i++) {
			int badL = i > 0 ? acumW[i-1] : 0;
			int badR = i + 1 < N ? acumE[i+1] : 0;
			ans = Math.min(ans, badL + badR);
		}
		System.out.println(ans);
	}
}
