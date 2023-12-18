import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;


public class Main {
	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];

		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(tmpArray[i]);
		}

		Date from = new Date();
		mergeSort(A, 0, A.length);
		Date to = new Date();
		//System.out.println("sort spends "+ (to.getTime() - from.getTime()) + "milli sec");

		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < A.length ; i++){
			//System.out.print(A[i]);
			sb.append(A[i]);
			if(i != A.length - 1){
				//System.out.print(" ");
				sb.append(" ");
			}
		}
		//System.out.println();
		//sb.append("\n");
		System.out.println(sb.toString());
		System.out.println(count);

	}

	static void merge(int[] A, int left, int mid, int right){
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];

		for(int i = 0; i < n1 ; i++){
			L[i] = A[left + i];
		}
		for(int i = 0; i < n2 ; i++){
			R[i] = A[mid + i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for(int k = left ; k < right; k++){
			if(L[i] <= R[j]){
				A[k] = L[i];
				i++;
				count++;
			}
			else {
				A[k] = R[j];
				j++;
				count++;
			}
		}
	}

	static void mergeSort(int[] A, int left, int right){
		int mid;
		if(left + 1 < right){
			mid = (left + right)/2;
			mergeSort(A, left, mid);
			mergeSort(A, mid, right);
			merge(A, left, mid, right);
		}
	}
}