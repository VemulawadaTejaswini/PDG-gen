import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(sc.hasNext()) {
			String[] text = sc.nextLine().split(" ");
			int[] cards = new int[text.length];
			boolean one = false; //1????????????
			int sum = 0; //????¨??????°
			boolean flag = false;

			for(int $ = 0; $ < text.length; $++) {
				cards[$] = Integer.parseInt(text[$]);
				if(cards[0] == 0) {
					flag = true;
					break;
				}
				if(cards[$] == 1) {
					one = true;
					sum++;
				} else if(cards[$] >= 10 && cards[$] <=13) {
					sum += 10;
				} else {
					sum += cards[$];
				}
			}

			if(flag) {
				break;
			}

			if(one) {
				if(sum + 10 <= 21) {
					sum += 10;
				}
			}

			if(sum > 21) {
				sum = 0;
			}

			System.out.println(sum);

		}

	}

}