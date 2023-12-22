import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = 0;

		for(int i = 1; i <= 50000; i++) {
			X = (int) (i * 1.08);
			if(N == X) {
				System.out.println(i);
				break;
			}

			if(i == 50000) {
				System.out.println(":(");
			}
		}


	}

}