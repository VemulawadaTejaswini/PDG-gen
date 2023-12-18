import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		sc.close();

		int left = X - K + 1;
		int right = X + K - 1;

		for(int i = left; i <= right; i++) {
			if(i != right) {
				System.out.print(i + " ");
			}else {
				System.out.print(i);
			}
		}
	}

}