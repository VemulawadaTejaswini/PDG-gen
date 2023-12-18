import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	
	//並び替える対象の配列の要素数：0...n-1
	int n;
	
	//対象の配列の中の最大値
	int k=0;
	
	//ソート対象の配列A, 登場数を記録する配列B
	int[] A,B;
	
	public void input() {
		n = sc.nextInt();
		A = new int[n];
		for(int i=0; i<n; i++) {
			A[i] = sc.nextInt();
			if(A[i] > k) k = A[i];
		}
		//配列に要素を格納しながら、最大値の探索を行った
		
		B = new int[k+1];
		//要素の登場数を記録する配列Bの宣言と初期化を行った：0...k
	}
	
	public void solve() {
		for(int i=0; i<n; i++) B[ A[i] ]++;
		//各要素数の登場回数を記録した
		
		for(int i=0; i<B.length; i++) {
			while(B[i] != 0) {
				if(i==k && B[i]==1) System.out.print(i);
				else System.out.print(i+" ");
				B[i]--;
			}
		}
		System.out.println();
		//配列Bの中身が0になるまで添字を出力した
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.solve();
	}
}
