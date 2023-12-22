import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		int D = Integer.parseInt(sc.next());
		sc.close();

		int start = Math.max(A, C);
		int end = Math.min(B, D);

		if(start <= end) {
			System.out.println(end - start);
		}else {
			System.out.println(0);
		}
	}

}
