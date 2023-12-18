import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		StringBuilder cardset;
		int shufflecount;
		int h;
		final char END = '-';

		Scanner stdIn = new Scanner(System.in);

		while(true) {
			cardset = new StringBuilder(stdIn.next());
			if(cardset.charAt(0) == END) {
				break;
			}
			shufflecount = stdIn.nextInt();

			for(int i = 0; i < shufflecount; i++) {
				h = stdIn.nextInt();
				String s = cardset.substring(0, h);
				cardset.delete(0, h);
				cardset.append(s);
			}
			System.out.println(cardset);
		}
		stdIn.close();
	}
}