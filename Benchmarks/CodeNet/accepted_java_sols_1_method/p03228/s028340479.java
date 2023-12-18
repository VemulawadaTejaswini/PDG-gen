import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		for (int i=0; i<K; i++) {
			//高橋フェイズ
			if (i%2==0) {
				if (A%2 != 0) {
					A--;
				}
				B=B+(A/2);
				A=A/2;
			} else { //青木フェイズ
				if (B%2 != 0) {
					B--;
				}
				A=A+(B/2);
				B=B/2;
			}
		}

		System.out.println(A + " " + B);
	}
}