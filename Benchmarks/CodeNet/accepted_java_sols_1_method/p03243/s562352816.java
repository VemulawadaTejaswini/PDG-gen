import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int div = N / 111;
		for(int i = 0; i < 3; i++) {
			if(N % 111 == 0) {
				System.out.print(div);
			}else {
				System.out.print(div + 1);
			}
		}

	}
}