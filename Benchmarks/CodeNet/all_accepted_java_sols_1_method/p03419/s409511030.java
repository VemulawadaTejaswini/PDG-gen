import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		if (N==1&&M ==1) {
			System.out.println(1);
		} else if (N==1) {
			System.out.println(M-2);
		} else if (M==1) {
			System.out.println(N-2);
		} else {
			long temp = N*M;
			temp = temp-N*2-M*2+4;
			System.out.println(temp);
		}
	}
}
