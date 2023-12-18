import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			
			int N = scan.nextInt();
			int K = scan.nextInt();
			int ans = 0;
					
			for(int i=0; i<N; i++) {
				int h = scan.nextInt();
				if(h >= K) ++ans;
			}
			
			System.out.println(ans);
			return;
			
		}
	}
}