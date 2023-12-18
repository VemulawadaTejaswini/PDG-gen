import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static Card l[], r[];
	static int n;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		Card a[] = new Card[n];
		Card b[] = new Card[n];
		l = new Card[n];
		r = new Card[n];
		int stable[] = new int[n];

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");
			a[i] = new Card(i, str[0], Integer.parseInt(str[1]));
			b[i] = new Card(i, str[0], Integer.parseInt(str[1]));
			l[i] = new Card(0, "", 0);
			r[i] = new Card(0, "", 0);
			stable[i] = i;
		}
		mergesort(a, n, 0, n);
		quicksort(b, 0, n - 1);

		isStable(b);

		for (int i = 0; i < n; i++) {
			System.out.println(b[i].suit + " " + b[i].value);
		}
	}

	static void isStable(Card a[]) {
		for (int i = 0; i < n - 1; i++) {
			if (a[i].value == a[i + 1].value) {
				if (a[i].id > a[i + 1].id) {
					System.out.println("Not stable");
					return;
				}
			}
		}
		System.out.println("Stable");
	}

	static void mergesort(Card A[], int n, int left, int right) {
		int mid;
		if (left + 1 < right) {
			mid = (left + right) / 2;
			mergesort(A, n, left, mid);
			mergesort(A, n, mid, right);
			merge(A, n, left, mid, right);
		}
	}

	static void merge(Card A[], int n, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		for (int i = 0; i < n1; i++) {
			l[i] = A[left + i];
		}
		for (int i = 0; i < n2; i++) {
			r[i] = A[mid + i];
		}
		l[n1].value = r[n2].value = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = left; k < right; k++) {
			if (l[i].value <= r[j].value) {
				A[k] = l[i++];
			} else {
				A[k] = r[j++];
			}
		}
	}

	static void quicksort(Card A[], int p, int r) {
		if (p < r) {
			int q = partition(A, p, r);
			quicksort(A, p, q - 1);
			quicksort(A, q + 1, r);
		}
	}

	static int partition(Card A[], int p, int r) {
		Card x = A[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (A[j].value <= x.value) {
				i++;
				Card temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		Card temp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = temp;
		return i + 1;
	}
}

class Card {
	String suit;
	int value;
	int id;

	public Card(int id, String suit, int value) {
		this.id = id;
		this.suit = suit;
		this.value = value;
	}
}
