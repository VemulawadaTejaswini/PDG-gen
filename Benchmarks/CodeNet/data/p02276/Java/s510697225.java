import java.util.Scanner;

public class Main {
	int[] A;

	public static void main(String[] args) {
		new Main().solve();
	}

	private void solve() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}
		int standard =partiton(0, n - 1);
		
		printAnswer(standard);
	}

	private int partiton(int start, int standard) {
		int x = A[standard];
		int i = start - 1;
		for (int j = start; j < standard; j++) {
			if (A[j] <= x) {
				i++;
				swapA(i, j);
			}
		}
		swapA(i+1, standard);
		
		return i+1;
	}
	
	private void printAnswer(int standard){
		boolean isZero=false;
		int i;
		for(i=0;i<standard;i++){
			if(isZero){
				System.out.print(" ");
			}
			isZero=true;
				System.out.print(A[i]);
		}
		if(isZero){
			System.out.print(" ");
		}
		System.out.print("["+A[standard]+"]");
		isZero=true;
		for(i=standard+1;i<A.length;i++){
			System.out.print(" ");
			System.out.print(A[i]);
		}
		System.out.println("");
	}

	private void swapA(int i, int j) {
		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;
	}
}