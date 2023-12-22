import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		int sum = 0;
		int ans = 0;
		
		for(int i=1; i<=N; i++) {
			sum += L + i -1;
		}
		
		if(N+L-1<=-1) {
			ans = sum - N - L + 1; 
		}else if(N+L-1>=0 && L<=-1) {
			ans = sum;
		}else {
			ans = sum - L;
		}
		System.out.println(ans);
	}
}

