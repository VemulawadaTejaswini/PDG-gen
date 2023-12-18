import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_4_A();
	}

	public static void ALDS1_4_A() {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int n = sc.nextInt();
		int[] S = new int[n];
		for(int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int[] T = new int[n];
		for(int i = 0; i < q; i++) {
			T[i] = sc.nextInt();
			for(int j = 0; j < n; j++) {
				if(T[i] == S[j]) {
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
	}

}
