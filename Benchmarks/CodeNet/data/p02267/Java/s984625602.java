import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] S = new int[n];
			for(int i=0; i<n; i++) {
				S[i] = sc.nextInt();
			}
			
			int q = sc.nextInt();
			int ans = 0;
			for(int i=0; i<q; i++) {
				int T = sc.nextInt();
				for(int j=0; j<n; j++) {
					if(T == S[j]) {
						ans++;
						break;
					}
				}
			}
			System.out.println(ans);
		}
	}	
}

