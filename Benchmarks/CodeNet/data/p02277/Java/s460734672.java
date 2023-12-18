import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final int INFTY = 1000000001;
	public static int MAX = 500000;
	public static Card[] L = new Card[MAX / 2 + 2];
	public static Card[] R = new Card[MAX / 2 + 2];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Card[] originalCards = new Card[n];
		for(int i = 0; i < n; i++) {
			originalCards[i] = new Card(sc.next(), sc.nextInt());
		}
		sc.close();
		Card[] quickSortCards = Arrays.copyOf(originalCards, n);
		Card[] mergeSortCards = new Card[MAX];
		for(int i = 0; i < n; i++) {
			mergeSortCards[i] = originalCards[i];
		}
		quickSort(quickSortCards, 0, n - 1);
		mergeSort(mergeSortCards, 0, n);
		System.out.println(anteiCheck(quickSortCards, mergeSortCards));
		for(int i = 0; i < n; i++) {
			Card card = quickSortCards[i];
			System.out.println(card.mark + " " + card.num);
		}
	}
	public static void quickSort(Card[] A, int p, int r) {
		int q;
		if(p < r) {
			q = partition(A, p, r);
			quickSort(A, p, q - 1);
			quickSort(A, q + 1, r);
		}
	}
	public static int partition(Card[] A, int p, int r) {
		int x = A[r].num;
		int i = p - 1;
		for(int j = p; j <= r- 1; j++) {
			if(A[j].num <= x) {
				i++;
				swap(A, i, j);
			}
		}
		swap(A, i + 1, r);
		return i + 1;
	}
	public static void swap(Card [] A, int index1, int index2) {
		Card work = A[index1];
		A[index1] = A[index2];
		A[index2] = work;
	}
	public static void merge(Card[] A, int left, int mid, int right) {
		int n1 = mid -left;
		int n2 = right - mid;
		for(int i = 0; i < n1; i++) {
			L[i] = A[left + i];
		}
		for(int i = 0; i < n2; i++) {
			R[i] = A[mid + i];
		}
		L[n1] = new Card(null, INFTY);
		R[n2] = new Card(null, INFTY);
		int i = 0;
		int j = 0;
		for(int k = left; k < right; k++) {
			if(L[i].num <= R[j].num) {
				A[k] = L[i];
				i++;
			} else {
				A[k] = R[j];
				j++;
			}
		}
	}
	public static void mergeSort(Card[] A, int left, int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			merge(A, left, mid, right);
		}
	}
	public static String anteiCheck(Card[] arrayA, Card[] arrayB) {
		for(int i = 0; i < arrayA.length; i++) {
			if(!arrayA[i].mark.equals(arrayB[i].mark)) {
				return "Not stable";
			}
		}
		return "Stable";
	}


}

class Card {
	String mark;
	int num;
	public Card(String mark, int num) {
		this.mark = mark;
		this.num = num;
	}

}