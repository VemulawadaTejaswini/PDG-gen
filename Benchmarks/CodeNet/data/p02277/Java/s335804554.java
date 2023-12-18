import java.util.Scanner;

public class Main {

	int n;
	Card array[];
	public static void main(String args[]) {
		new Main().run();
	}
	Main() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		array = new Card[n];
		for (int i = 0; i < n; i++) {
			String a = scan.next();
			if (i == 0)
				array[i] = new Card(a.charAt(0), scan.nextInt(),null);
			else 
				array[i] = new Card(a.charAt(0),scan.nextInt(),array[i-1]);
		}
	}
	void run() {
		quicksort(array,0,n);
		int befNum = array[0].num;
		boolean stable = true;
		for (int i = 1; i < n; i++) {
			if (befNum == array[i].num) {
				if (array[i].before.suit != array[i-1].suit || array[i].before.num != array[i-1].num){
					stable = false;
					break;
				}
			}
		}
		System.out.println(stable?"Stable":"Not stable");
		for (int i = 0; i < n; i++) {
				System.out.println(array[i]);
		}
	}
	int partition(Card[] A, int p, int r) {
		int x = A[r-1].num;
		int i = p - 1;
		for (int j = p; j < r- 1; j++) {
			if (A[j].num <= x) {
				i++;
				Card tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
 		}
		Card tmp = A[i+1];
		A[i+1] = A[r-1];
		A[r-1] = tmp;
		return i+1;
	}
	void quicksort(Card[] A, int p, int r) {
		if (p < r) {
			int q = partition(A,p,r);
			quicksort(A,p,q);
			quicksort(A,q+1,r);
		}
	}
	class Card {
		char suit;
		int num;
		Card before;
		Card(char a, int b, Card before) {
			suit = a;
			num = b;
			this.before = before;
		}
		public String toString() {
			return suit + " " + num;
		}
	}
}

