import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int h[] = new int[N];
		for(int i=0;i<N;i++) {
			h[i]=sc.nextInt();
		}
		
		int ans=0;

		for(int height:h) {
			if(height>=K) {
				ans++;
			}
		}
		
		System.out.println(ans);
		
	}

}
