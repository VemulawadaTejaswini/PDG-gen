import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		
		String ans = "APPROVED";
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
			if(A[i] % 2 == 0) {
				if(A[i] % 3 != 0 && A[i] % 5 != 0) {
					ans = "DENIED";
					break;
				}
			}
		}
		sc.close();
		System.out.println(ans);
	}

}