import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in) );

		int n = Integer.parseInt(br.readLine());

		Card[] nc = new Card[n];
		for (int i=0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			Card c = new Card(temp[0], Integer.parseInt(temp[1]), i);
			nc[i] = c;
//			nc[i].suit = temp[0];
//			nc[i].num = Integer.parseInt(temp[1]);
//			nc[i].pos = i;
		}

		quicksort(nc, 0, n-1);

		int counter;
		for (counter=0; counter < n-1; counter++) {
			if (nc[counter].num == nc[counter+1].num) {
				if (nc[counter].pos > nc[counter+1].pos) {
					System.out.println("Not stable");
					break;
				}
			}
		}
		if (counter == n-1) {
			System.out.println("Stable");
		}

		for(int i=0; i < n; i++) {
			System.out.println(nc[i]);
		}
	}

	static class Card {
		String suit;

		int num;

		int pos;

		Card(String suit, int num, int pos) {
			this.suit = suit;
			this.num = num;
			this.pos = pos;
		}

		@Override
		public String toString(){
			return suit + " " + num;
		}
	}

	static int partition(Card[] A, int p, int r) {
		int x = A[r].num;
		int i = p - 1;
		Card temp;
		for (int j=p; j < r; j++) {
			if (A[j].num <= x) {
				i++;
				temp = A[j];
				A[j] = A[i];
				A[i] = temp;
			}
		}
		temp = A[r];
		A[r] = A[i+1];
		A[i+1] = temp;
		return i+1;
	}

	static void quicksort(Card[] A, int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			quicksort(A, p, q-1);
			quicksort(A, q+1, r);
		}
	}
}