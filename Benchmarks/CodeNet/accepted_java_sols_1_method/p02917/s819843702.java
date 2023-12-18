import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int BN = sc.nextInt() - 1;
		int[] B = new int[BN];
		for(int i=0;i<BN;i++) {
			B[i] = sc.nextInt();
		}
		
		int total = B[0];
		for(int i=1;i<BN;i++) {
			total += Math.min(B[i], B[i-1]);
		}
		total += B[BN-1];
		System.out.println(total);
		
		sc.close();
	}
}