import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N+1];
		for (int i=0; i<N; i++){
			A[i] = sc.nextInt();
		}


		shellSort(A, N);
		for (int i=0; i<N-1; i++){
			System.out.println(A[i] + " ");
		}
		System.out.println(A[N-1]);
	}
		
	
	public static void shellSort(int[] A, int n){
		int m = A.length / 2+1;
		ArrayList<Integer> mnum = new ArrayList<Integer>();
		int icnt = 0;
		int mcnt = 0;
		while(m > 0){
			insertionSort(A, n, m, icnt);
			mnum.add(m);
			m /= 4;
			mcnt++;
		}
		System.out.println(mcnt);
		for (int i=0; i<mcnt-1; i++){
			System.out.print(mnum.get(i) + " ");
		}
		System.out.println(mnum.get(mcnt-1));
		System.out.println(A[n]);
	}
	
	public static void insertionSort(int[] A, int n, int g, int cnt){
		int v;
		int j;
		for (int i=g; i<n; i++){
			v = A[i];
			j = i - g;
			while (j >= 0 && A[j] > v){
			    A[j+g] = A[j];
			    j = j - g;
				A[j+g] = v;
				A[n]++;
			}
		}
	}
}
