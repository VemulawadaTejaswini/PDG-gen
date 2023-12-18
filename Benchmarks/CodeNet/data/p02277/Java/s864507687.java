import java.util.Scanner;
public class Main {
private static Scanner s = new Scanner(System.in);
public static void main(String[] args) {
	int n = s.nextInt();
	Card[] A = new Card[n];
	StringBuilder sb = new StringBuilder();

	for(int i = 0;i < n;i++) {
		A[i] = new Card();
		A[i].suit = s.next();
		A[i].n = s.nextInt();
		A[i].id = i;
	}
	quicksort(A,0,n-1);
	if(judge(A) == true) {
		sb.append("Stable\n");
		}else {
			sb.append("Not stable\n");
		}
	for(int i = 0;i < n;i++) {
		sb.append(A[i].suit + " " + A[i].n + "\n");
	}
	System.out.print(sb.toString());
	}

static int partition(Card[] a,int p,int r) {
		Card x = a[r];
		int i = p-1;

		for(int j = p;j < r;j++) {
			if(a[j].n <= x.n) {
				i++;
				Card tmp;
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
			Card tmp;
			tmp = a[i+1];
			a[i+1] = a[r];
			a[r] = tmp;

		return i+1;
		}

static void quicksort(Card[] A,int p,int r) {
	if(p < r) {
		int q;
		q = partition(A,p,r);
		quicksort(A,p,q-1);
		quicksort(A,q+1,r);
	}
}

static boolean judge(Card[] A){
    for(int i = 0; i < A.length; i++){
        for(int j = i + 1; j < A.length; j++){
        if(A[i].n == A[j].n && A[i].id > A[j].id)
            return false;
        }
    }
        return true;
}
}

class Card{
	String suit;
	int n;
	int id;
}
