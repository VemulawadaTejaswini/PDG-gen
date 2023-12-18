import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		StringBuffer cards = new StringBuffer(sc.next());
		
		for (; !cards.toString().equals("-"); cards = new StringBuffer(sc.next())) {
			int m = sc.nextInt();

			int sum = 0;
			for (int i = 0; i < m; i++) {
				sum += sc.nextInt();
			}
			sum = sum % cards.length();
			cards = cards.append(cards.substring(0, sum));
			cards.delete(0, sum);

			System.out.println(cards);
		}
		
		sc.close();
	}
}