import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] mochi = new Integer[N];
		int ans = 1;
		
		for(int i =0; i< N; i++) {
			mochi[i] = sc.nextInt();
		}
		Arrays.sort(mochi,Comparator.reverseOrder());
		
		for(int i = 0; i < N; i++) {
			if(i != N - 1) {
				if(mochi[i] > mochi[i+1]) {
					ans++;
					}
				} 
		}
		System.out.println(ans);
	}
}