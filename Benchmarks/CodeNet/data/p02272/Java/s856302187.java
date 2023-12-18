import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int N,cnt;
	private int[] A;

	public void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();
		cnt = 0;

		A = new int[N];
		for(int i = 0;i < N;i++) {
			A[i] = scan.nextInt();
		}

		mergeSort(0,N);

		for(int i = 0;i < N;i++) {
			System.out.print(A[i] + (i == N-1 ? "\n" : " "));
		}

		System.out.println(cnt);

		scan.close();
	}

	public void merge(int left,int mid,int right) {
		int n1 = mid - left;
		int n2 = right - mid;

		int L[] = new int[n1 + 1];
		int R[] = new int[n2 + 1];

		for(int i = 0 ; i < n1;i++) {
			L[i] = A[left + i];
		}

		for(int i = 0 ; i < n2;i++) {
			R[i] = A[mid + i];
		}

		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;

		int i = 0,j = 0;

		for(int k = left;k < right;k++) {
			if(L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			}else {
				A[k] = R[j];
				j++;
			}
			cnt++;
		}
	}

	public void mergeSort(int left,int right) {
		if(left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(left,mid);
			mergeSort(mid,right);
			merge(left,mid,right);
		}
	}
}
