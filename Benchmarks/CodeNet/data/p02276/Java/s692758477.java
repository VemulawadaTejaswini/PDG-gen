import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		part(A, 0, A.length - 1);
	}

	public static void part(int[] A, int p, int r) {
		int x = A[r]; //基準値
		int i = p - 1;
		for(int j = p; j < r; j++) {
			if(A[j] <= x) {
				i++;
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
		int temp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = temp;
		
		for(int y = 0; y <= r; y++) {
			if(A[y] == x && y == r) {
				System.out.print("[" + A[y] + "]\n");
			}else if(y == i + 1){
				System.out.print("[" + x + "] ");
			}else if(y == r) {
				System.out.print(A[y] + "\n");
			}else {
				System.out.print(A[y] + " ");
			}
		}
	}
}


