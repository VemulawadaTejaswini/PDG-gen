import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static class Card {
		private String design;
		private int number;
		private int inputIndex;

		public Card(String design, int number, int inputIndex) {
			this.design = design;
			this.number = number;
			this.inputIndex = inputIndex;
		}

		public String getDesign() {
			return this.design;
		}

		public int getNumber() {
			return this.number;
		}

		public int getInputIndex() {
			return this.inputIndex;
		}
	}

	public static int partition(Card[] a, int p, int r) {
		Card tmp;

		int x = a[r].getNumber();
		int i = p - 1;

		for(int j = p; j < r; j++) {
			if (a[j].getNumber() <= x) {
				i = i + 1;
				tmp = a[i];
				a[i]= a[j];
				a[j] = tmp;
			}
		}

		tmp = a[i + 1];
		a[i + 1] = a[r];
		a[r] = tmp;

		return i + 1;
	}

	public static void quickSort(Card[] a, int p, int r ) {
		if(p < r) {
			int q = partition(a, p, r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cardOfNumber = Integer.parseInt(br.readLine());

		Card[] cards = new Card[cardOfNumber];

		for(int i = 0; i < cardOfNumber; i++) {
			String[] cardElement = br.readLine().split(" ");
			String design = cardElement[0];

			int number = Integer.parseInt(cardElement[1]);

			int index = i + 1;

			Card card = new Card(design, number, index);
			cards[i] = card;

		}

		/*
		------------------------------
		Scanner scan = new Scanner(new InputStreamReader(System.in));
		------------------------------

		int matrixLength = scan.nextInt();

		int[] a = new int[matrixLength];

		for(int i = 0; i < matrixLength; i++) {
		------------------------------
			a[i] = scan.nextInt();
		------------------------------
		}
		 */

		quickSort(cards, 0, cardOfNumber - 1);
		
		StringBuilder sb = new StringBuilder();
		boolean isStable = true;
		for(int i = 0; i < cardOfNumber; i++) {
			sb.append(cards[i].getDesign());
			sb.append(" ");
			sb.append(cards[i].getNumber());
			sb.append(System.getProperty("line.separator"));
			if(i < cardOfNumber - 1){
				if(cards[i].getNumber() == cards[i + 1].getNumber()) {
					if(cards[i].getInputIndex() > cards[i + 1].getInputIndex()) {
						isStable = false;
					}
				}
			}
			
		}
		if(isStable) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
		
		System.out.print(sb.toString());
	}
}