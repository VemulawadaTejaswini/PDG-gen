//API???????????????
import java.io.IOException;
import java.util.Scanner;

class Main {
 static Card2[] L;
	static Card2[] R;
	static int Sen = 2000000000;

	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Card[] CardA = new Card[n];
		Card2[] CardB = new Card2[n];
		L = new Card2[n / 2 + 2];
		R = new Card2[n / 2 + 2];

		for(int i = 0; i < n / 2 + 2; i++){
			L[i] = new Card2();
			R[i] = new Card2();
		}

		for(int i = 0; i < n; i++){
			CardA[i] = new Card();
			CardB[i] = new Card2();

			CardA[i].sort = scan.next();
			CardA[i].num = scan.nextInt();
			CardB[i].num = CardA[i].num;
			CardB[i].sort = CardA[i].sort;
		}

		QuickSort(CardA, 0, n - 1);
		MergeSort(CardB, 0, n);
		boolean stable = true;

		for(int i = 0; i < n; i++){
			if(CardA[i].sort != CardB[i].sort){
				stable = false;
			}
		}

		if(stable) System.out.println("Stable");
		else System.out.println("Not stable");

		for(int i = 0; i < n; i++){
			System.out.println(CardA[i].sort + " " + CardA[i].num);
		}
	}

	public static void QuickSort(Card[] A, int l, int r){
		if(l >= r) return;
		int p = Partition(A, l, r);
		QuickSort(A, l, p - 1);
		QuickSort(A, p + 1, r);
	}

	public static int Partition(Card[] A, int l, int r){
		int threshold = A[r].num;
		int i = l - 1;
		for(int j = l; j < r; j++){
			if(A[j].num <= threshold){
				i++;
				exchange(A, i, j);
			}
		}
		i++;
		exchange(A, i, r);

		return i;
	}

	public static void exchange(Card[] A, int i, int j){
		Card tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}

	public static void MergeSort(Card2[] B, int left, int right){
		if(left + 1 < right){
			int middle = (left + right) / 2;
			MergeSort(B, left, middle);
			MergeSort(B, middle, right);
			Merge(B, left, middle, right);

		}
	}

	public static void  Merge(Card2[] B, int left, int middle, int right){
		int n1 = middle - left;
		int n2 = right - middle;
		for(int i = 0; i < n1; i++){
			L[i] = B[left + i];
		}
		for(int i = 0; i < n2; i++){
			R[i] = B[middle + i];
		}
		L[n1].num = Sen;
		R[n2].num = Sen;

		int i = 0;
		int j = 0;
		for(int k = left; k < right; k++){
			if(L[i].num <= R[j].num){
				B[k] = L[i];
				i++;
			}else{
				B[k] = R[j];
				j++;
			}
		}
	}
}

class Card{
	int num;
	String sort;
}

class Card2{
	int num;
	String sort;
}