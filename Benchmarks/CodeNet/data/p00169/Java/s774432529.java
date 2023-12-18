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

			if(one == 1) {
				if(sum + 11 > 21) {
					sum++;
				} else {
					sum += 11;
				}
			} else {
				if(sum + 11 + one - 1 > 21) {
					sum += one;
				} else {
					sum += 11 + one - 1;
				}
			}

			if(sum > 21) {
				sum = 0;
			}

			System.out.println(sum);

		}

	}

}