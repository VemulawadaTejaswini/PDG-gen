import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());

		int total = 0;
		for(int i=0; i<2; i++) {
			if(A >=B) {
				total += A;
				A--;
			} else {
				total += B;
				B--;
			}
		}
		System.out.println(total);

	}
}
