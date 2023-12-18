import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(" ");

			int[] cards = new int[10];
			for (int i = 0; i < cards.length; i++) {
				cards[i] = 1;
			}
			int c0 = Integer.parseInt(nico[0]);
			int c1 = Integer.parseInt(nico[1]);
			int c2 = Integer.parseInt(nico[2]);

			cards[c0 - 1] = 0;
			cards[c1 - 1] = 0;
			cards[c2 - 1] = 0;
			
			int rest = 20 - c1 - c2;
			
			int p = 0;
			for (int i = 0; i < cards.length; i++) {
				if ((cards[i] == 1) && ((i + 1) > rest)) p++;
			}

			if (p > 3) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}