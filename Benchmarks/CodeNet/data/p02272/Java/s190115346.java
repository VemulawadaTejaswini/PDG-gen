import java.util.Scanner;

public class Main {

	public static final int MAX = 500000;
	public static final int SENTINEL = (int)Math.pow(10, 9) + 1;
	public static int[] A = new int[MAX];
	public static int[] L = new int[MAX/2+1];
	public static int[] R = new int[MAX/2+1];
	public static int count = 0;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			A[i] = scan.nextInt();
		}
		merge_sort(0,n);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++){
			sb.append(A[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
		System.out.println(count);
	}


	public static void merge_sort(int left,int right){
		if(left+1 == right) return;
		int mid = (right + left) / 2;
		merge_sort(left,mid);
		merge_sort(mid,right);

		merge(left,right);
	}

	public static void merge(int left,int right){
		int mid = (right + left) / 2;
		int n1 = mid - left;
		int n2 = right - mid;
		for(int i = 0; i < n1; i++) L[i] = A[left + i];
		for(int y = 0; y < n2; y++) R[y] = A[mid + y];
		L[n1] = R[n2] = SENTINEL;

		int x = 0;
		int y = 0;
		for(int i = left; i < right; i++){
			count++;
			if(L[x] <= R[y]){
				A[i] = L[x++];
			}else{
				A[i] = R[y++];
			}
		}
	}
}