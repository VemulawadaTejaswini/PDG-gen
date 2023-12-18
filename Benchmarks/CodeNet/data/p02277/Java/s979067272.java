package Lecture6;
import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	
	//配列の要素数：0...n-1
	int n;
	//カードの数を格納する配列
	int[] A;
	//カードの絵柄を格納する配列
	String[] card;
	//partition発見のための変数
	int i;
	
	public void input() {
		n = sc.nextInt();
		A = new int[n];
		card = new String[n];
		for(int i=0; i<n; i++) {
			card[i] = sc.next();
			A[i] = sc.nextInt();
		}
		sort(A, 0, n-1);
	}

	int q;
	public void sort(int[] A, int p, int r) {
		if(p < r) {
			q = partition(A, p, r);
			sort(A, p, q-1);
			sort(A, q+1, r);
		}
	}
	
	public int partition(int[] A, int p, int r) {
		int swap;
		String note;
		int x = A[r];
		i = p-1;
		for(int j=p; j<r; j++) {
			if(A[j] <= x) {
				i++;
				swap = A[i];
				A[i] = A[j];
				A[j] = swap;
				
				note = card[i];
				card[i] = card[j];
				card[j] = note;
			}
		}
		swap = A[i+1];
		A[i+1] = A[r];
		A[r] = swap;
		
		note = card[i+1];
		card[i+1] = card[r];
		card[r] = note;
		
		return i+1;
	}
	
	public void output() {
		for(int i=0; i<n; i++) {
			System.out.println(card[i] + " "+ A[i]);
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

