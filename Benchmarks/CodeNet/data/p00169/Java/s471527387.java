import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(sc.hasNext()) {
			String[] text = sc.nextLine().split(" ");
			int[] cards = new int[text.length];
			int one = 0; //1?????°
			int sum = 0; //????¨??????°
			boolean flag = false;
			for(int $ = 0; $ < text.length; $++) {
				cards[$] = Integer.parseInt(text[$]);
				if(cards[0] == 0) {
					flag = true;
					break;
				}
				if(cards[$] == 1) {
					one++;
				} else if(cards[$] >= 10 && cards[$] <=13) {
					sum += 10;
				} else {
					sum += cards[$];
				}
			}

			if(flag) {
				break;
			}

			if(one > 0) {
				int eleven = 0;
				for(int $ = 0; $ < one; $++) {
					if(sum + ($ + 1) * 11 > 21) {
						eleven -= 1;
						break;
					}
					eleven++;
				}

				sum += eleven * 11 + (one - eleven);
			}

			if(sum > 21) {
				sum = 0;
			}

			System.out.println(sum);

		}

	}

}