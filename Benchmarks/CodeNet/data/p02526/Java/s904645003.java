import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		
		int S[] = new int [n];
		for (int i = 0; i < n; i++){
			S[i] = scan.nextInt();
		}
		
		Arrays.sort(S);
		
		int q = scan.nextInt();
		
		int cnt = 0;
		
		for (int i = 0; i< q; i++){
			int T = scan.nextInt();
			int c = Arrays.binarySearch(S, T);
			
			if (c >= 0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}