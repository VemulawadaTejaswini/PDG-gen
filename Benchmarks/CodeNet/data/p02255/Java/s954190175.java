import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Config 
		Scanner sc = new Scanner(System.in);
		
		// Input
		int N = Integer.parseInt(sc.nextLine());
		String[] inList = sc.nextLine().split(" ");
		int[] numList = new int[N];
		for(int i=0; i<N; i++) {
			numList[i] = Integer.parseInt(inList[i]);
		}
		
		// Sort
		Main prob1 = new Main();
		prob1.insertionSort(numList, N);
		
	}
	
	// insertion sort implement
	private void insertionSort(int[] A, int N) {
		for(int i=0; i<A.length; i++) {
			int v = A[i];
			int j = i - 1;
			while(j>=0 && A[j]>v) {
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			Output(A);
		}
	}
	
	// Output
	private void Output(int[] A) {
		String ans = "";
		for(int i=0; i<A.length-1; i++) {
			ans += A[i] + " "; 
		}
		ans += A[A.length-1];
		System.out.println(ans);
	}
}

