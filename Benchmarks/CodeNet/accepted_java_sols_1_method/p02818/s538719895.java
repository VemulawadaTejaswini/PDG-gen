import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();
		if(K <= A) {
			A -= K;
			System.out.println(A + " " + B);
		}
		else {
			K -= A;
			B -= K;
			System.out.println(0 + " " + Math.max(0, B));
		}

	}

}