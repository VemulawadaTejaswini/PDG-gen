import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		double B = Double.parseDouble(sc.next());
		sc.close();

		int hunSum = (int) Math.floor(100 * B);
		int niketame = hunSum % 10;
		int oneKeteme = (hunSum / 10) % 10;
		
		long checkOne = (A * oneKeteme) % 10;
		long checkTwo = (A * niketame) % 100;

		if(checkOne + checkTwo >= 100) {
			System.out.println(A * hunSum / 100+ 1);
		}else {
			System.out.println(A * hunSum / 100);
		}
	}

}