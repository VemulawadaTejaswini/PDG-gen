import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int f = 0;

		for (int price = B*10; price < (B+1)*10; price++) {
			if ((int)((double)price*0.08 + 0.01) == A) {
				System.out.println(price);
				f++;
				break;
			}
		}

		if (f == 0) {
			System.out.println(-1);
		}

	}

}