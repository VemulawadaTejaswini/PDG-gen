import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Character> aCard = new LinkedList<>();
		LinkedList<Character> bCard = new LinkedList<>();
		LinkedList<Character> cCard = new LinkedList<>();

		// input
		String aString = scan.next();
		for (int i = 0; i < aString.length(); i++) {
			aCard.add(aString.charAt(i));
		}
		String bString = scan.next();
		for (int i = 0; i < bString.length(); i++) {
			bCard.add(bString.charAt(i));
		}
		String cString = scan.next();
		for (int i = 0; i < cString.length(); i++) {
			cCard.add(cString.charAt(i));
		}

		// check
		char turn = aCard.poll();
		boolean endFlag = false;
		while (true) {

			switch (turn) {
			case 'a':
				if (aCard.size() == 0) {
					System.out.println("A");
					endFlag = true;
					break;
				}
				turn = aCard.poll();
				break;
			case 'b':
				if (bCard.size() == 0) {
					System.out.println("B");
					endFlag = true;
					break;
				}
				turn = bCard.poll();
				break;
			case 'c':
				if (cCard.size() == 0) {
					System.out.println("C");
					endFlag = true;
					break;
				}
				turn = cCard.poll();
			}

			if (endFlag) {
				break;
			}
		}

	}
}
