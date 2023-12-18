import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int[] s = new int[100000];
			boolean ans = true;
			int N = sc.nextInt();
			int K = sc.nextInt();
			if(N == 0 && K == 0) break;
			for(int k = 0; k < K; k++){
				s[k] = sc.nextInt();
			}
			for(int n = 0; n < N; n++){
				for(int k = 0; k < K; k++){
					s[k] -= sc.nextInt();
				}
			}
			for(int k = 0; k < K; k++){
				if(s[k] < 0){
					ans = false;
					break;
				}
			}
			if(ans == true) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}