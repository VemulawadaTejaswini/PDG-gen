import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		int K = sc.nextInt();
		for (int i=0;i<K;i++) {
			if (i%2==0) {
				A/=2;
				B+=A;
			} else {
				B/=2;
				A+=B;
			}
		}
		System.out.println(A+" "+B);
	}
}