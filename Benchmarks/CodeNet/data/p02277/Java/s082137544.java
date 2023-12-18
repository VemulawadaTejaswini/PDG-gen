

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class Main {

	 class Card {
		int number;
		String letter;

		public Card(int number, String letter) {
			this.number = number;
			this.letter = letter;
		}
		
		public boolean equals(Card card){
			if (this.number == card.number && this.letter.equals(card.letter)) {
				return true;
			}else{
				return false;
			}
		}
		
		public String toString() {
			return letter + " " +  number;
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.solv();
	}

	private void solv() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		// ???????????????????????¨
		Card[] cards = new Card[n];
		for (int i = 0; i < n; i++) {
			String letter = input.next();
			int number = input.nextInt();
			Card card = new Card(number, letter);
			cards[i] = card;
		}
		quickSort(cards, 0, n);
		
		// ????????????????????¨
		Card[] cards2 = Arrays.copyOf(cards, cards.length);
		//mergeSort(cards2, 0, n);
	
		// ????????????????????????????????????
		boolean isStable = true;
		for (int i = 0; i < cards.length; i++) {
			if (!cards[i].equals(cards2[i])) {
				isStable = false;
			}
		}
		if (isStable) {
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}
		
		// ???????????????????????????????????????
		for (Card card : cards) {
			System.out.println(card);
		}
		
//		print(cards);
//		print(cards2);
	}
	
	private void quickSort(Card[] cards, int p, int r){
		if (p < r) {
			int q = partition(cards, p, r);
			quickSort(cards, p, q - 1);
			quickSort(cards, q + 1, r);
		}else{
			return;
		}
	}

	private int partition(Card[] cards, int p, int r) {
		// p(???????????£?????§???)????????????????????????
		int partition = p - 1;
		for (int i = p; i < r; i++) {
			if (cards[i].number <= cards[cards.length - 1].number) {
				// ???????????????
				partition++;
				
				// swap
				Card temp = cards[i];
				cards[i]= cards[partition];
				cards[partition] = temp;
			}
		}
		return partition;
	}
	
	// ??????
    private void merge(Card[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        Card[] L = new Card[n1+1], R = new Card[n2+1];
        Arrays.fill(L, new Card(0, ""));
        Arrays.fill(R, new Card(0, ""));
         
        for (int i = 0; i < n1; i++) {
        	Card card = new Card(A[left + i].number, A[left + i].letter);
        	L[i] = card;
        }
        for (int i = 0; i < n2; i++) {
        	Card card = new Card(A[mid + i].number, A[mid + i].letter);
            R[i] = card;
        }
        
        L[n1].number = Integer.MAX_VALUE;
        R[n2].number = Integer.MAX_VALUE;
         
        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            if (L[i].number <= R[j].number) {
                A[k] = L[i++];
            } else {
                A[k] = R[j++];
            }
        }
    }
    
    // ?????????
    private void mergeSort(Card[] A, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }
    }

	private void print(Object[] xs) {
		StringBuilder sb = new StringBuilder();
		for (Object x : xs)
			sb.append(x.toString()).append(' ');
		System.out.println(sb.toString().trim());
	}

	private void print(int[] xs) {
		StringBuilder sb = new StringBuilder();
		for (int x : xs) {
			sb.append(x).append(' ');
		}
		System.out.println(sb.toString().trim());
	}

	private static class Scanner {
		BufferedReader r;
		StreamTokenizer st;

		public Scanner(InputStream in) {
			r = new BufferedReader(new InputStreamReader(in));
			st = new StreamTokenizer(r);
		}

		public String next() {
			nextToken();
			return st.sval;
		}

		public Integer nextInt() {
			nextToken();
			return (int) st.nval;
		}

		private int nextToken() {
			int token = st.TT_EOF;
			try {
				token = st.nextToken();
			} catch (IOException e) {
			}
			return token;
		}
	}
}