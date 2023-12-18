import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] str;
		while(sc.hasNext()) {
			str = sc.next().split(",");
			int[] hand = new int[13];
			int max = 0;
			boolean flag = false;
			int number = Integer.MIN_VALUE;
			int count = 0;

			Arrays.fill(hand, 0);

			//???????????\?????????
			for(int $ = 0; $ < str.length; $++) {
				int num = Integer.parseInt(str[$]) - 1;
				hand[num] += 1;
				max = Math.max(max, hand[num]);
			}

			if(hand[0] == 1 && hand[12] == 1 && hand[11] == 1 && hand[10] == 1 &&hand[9] == 1) {
				flag = true;
			} else {
				for(int $ = 0; $ < hand.length; $++) {
					if(hand[$] == 1 && ($ == number || number == Integer.MIN_VALUE)) {
						number = $ + 1;
						if(++count == 5) {
							flag = true;
							break;
						}
					}
				}
			}

			Arrays.sort(hand);

			//?????????????????????????????°???4????????¨???
			if(max == 4) {
				System.out.println("four card");
			} else if(max == 3) {
				if(hand[hand.length - 2] == 2) {
					System.out.println("full house");
				} else {
					System.out.println("three card");
				}
			} else if(max == 2) {
				if(hand[hand.length - 2] == 2) {
					System.out.println("two pair");
				} else {
					System.out.println("one pair");
				}
			} else {
				if(flag) {
					System.out.println("straight");
				} else {
					System.out.println("null");
				}
			}
		}
	}

}