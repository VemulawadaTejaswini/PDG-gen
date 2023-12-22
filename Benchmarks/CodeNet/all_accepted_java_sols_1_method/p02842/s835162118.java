import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int check = N * 100;
		int x = (int) Math.floor(check / 108);
		int y = x + 1;

		int checkX = (int) Math.floor(x * 1.08);
		int checkY = (int) Math.floor(y * 1.08);

		if(N == checkX) {
			System.out.println(x);
		}else if(N == checkY) {
			System.out.println(y);
		}else {
			System.out.println(":(");
		}
	}

}