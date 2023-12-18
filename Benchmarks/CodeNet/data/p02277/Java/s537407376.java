import java.io.IOException;
import java.util.Scanner;

class Main {
 public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Card[] CardA = new Card[n];
		Card2[] CardB = new Card2[n];

		for(int i = 0; i < n; i++){
			CardA[i] = new Card();
			CardB[i] = new Card2();

			CardA[i].sort = scan.next();
			CardA[i].num = scan.nextInt();
			CardB[i].num = CardA[i].num;
			CardB[i].sort = CardA[i].sort;
		}

		QuickSort(CardA, 0, n - 1);
		boolean stable = true;
		for(int i = 0; i < n; i++){
			if(CardA[i].sort.equals(CardB[i].sort)){
			}else {
				stable = isStable(CardA, CardB, n);
				break;
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
	
	static boolean isStable(Card[] A, Card2[] B, int n){
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n - 1; j++){
				for(int a = 0; a < n - 1; a++){
					for(int b = a + 1; b < n - 1; b++){
						if(A[i].num == B[j].num && A[i].sort.equals(B[b].sort) && A[j].sort.equals(B[a].sort)){
							return false;
						}
					}
				}
			}
		}
		return true;
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