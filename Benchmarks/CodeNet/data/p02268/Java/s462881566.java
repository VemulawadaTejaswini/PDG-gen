import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []S = new int[n + 1];
		for(int i = 0; i < n; i++) {
			S[i] = scan.nextInt();
		}
		int q = scan.nextInt();
		int []T = new int[q];
		for(int i = 0; i < q; i++) {
			T[i] = scan.nextInt();
		}
		scan.close();
		int sum = 0;
		for(int i = 0; i < q; i++) {
			if(binarySearch(S, n, T[i]) == 1) {
				sum ++;
			}
		}
		System.out.println(sum);
	}
	public static int binarySearch(int[] A, int n, int key) {
		int left = 0;
		int right = n;
		int mid;
		while(left < right) {
			mid = (left + right) / 2;
			if(key == A[mid]) {
				return 1;
			}
			if(key > A[mid]) {
				left = mid + 1;
			}else if(key < A[mid]){
				right = mid;
			}
		}
		return 0;
	}
}
