import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		sc.close();
		
		for(int i = 1; i <= K; i++) {
			if(i % 2 != 0) {
				if(A % 2 == 1) A--;
				B += A / 2;
				A -= A / 2;
			}else {
				if(B % 2 == 1) B--;
				A += B / 2;
				B -= B / 2;
			}
		}
		System.out.println(A + " " + B);
	}

}