import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		
		sc.close();
		
		int ans = 0;
		
		if(K<A) {
			ans = K;
		}else if(K<=A+B) {
			ans = A;
		}else {
			ans = 2*A+B-K;;
		}
		
		System.out.println(ans);
	}

}