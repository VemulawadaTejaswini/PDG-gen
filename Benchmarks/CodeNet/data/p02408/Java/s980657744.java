import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[][] card_array = new boolean[4][13];
		String card;
		int number;

		int count = sc.nextInt();

		for(int i = 0; i < count; i++) {
			card = sc.next();
			number = sc.nextInt();
			switch (card) {
			case "S":
				card_array[0][number - 1] = true;
				break;
			case "H":
				card_array[1][number - 1] = true;
				break;
			case "C":
				card_array[2][number - 1] = true;
				break;
			case "D":
				card_array[3][number - 1] = true;
				break;
			}
		}
		sc.close();
		for(int i = 0; i < card_array.length; i++) {
			for(int j = 0; j < card_array[i].length; j++) {
				if(card_array[i][j] == false ) {
					switch (i) {
					case 0:
						System.out.printf("S %d\n", j + 1);
						break;
					case 1:
						System.out.printf("H %d\n", j + 1);
						break;
					case 2:
						System.out.printf("C %d\n", j + 1);
						break;
					case 3:
						System.out.printf("D %d\n", j + 1);
						break;
					}
				}
			}
		}
	}
}

