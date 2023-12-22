import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int K = scan.nextInt();
		int ans = 0;
		
		if(A < K) {
			for(int i=0;i<A;i++) {
				ans++;
			}
		}else {
			for(int j=0;j<K;j++) {
				ans++;
			}
		}
		if(B < K-A) {
			for(int i=0;i<K-A-B;i++) {
				ans--;
			}
		}
		System.out.println(ans);
	}

}
