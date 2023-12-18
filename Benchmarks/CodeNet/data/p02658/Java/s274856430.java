import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long[] A = new long[N];
		long ans = 1;
		
		for(int i=0;i<N;i++) {
			A[i] = scan.nextLong();
			ans = ans * A[i];
		}
		if(ans > (long)Math.pow(10, 18)) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}

}
