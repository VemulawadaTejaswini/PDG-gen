import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static final int max = 500000;
	private static int count = 0;
	private static int[] l = new int[max/2];
	private static int[] r = new int[max/2];
	private static int sentinel = 1000000001;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine());
		String[] AStr = br.readLine().split(" ");
		int[] A = new int[n];
		for(int i = 0; i < n ; i++){
			A[i] = Integer.parseInt(AStr[i]);
		}

		mergeSort(A,0,n);

		StringBuilder sb = new StringBuilder();

		for(int i = 0 ; i < n ; i++){
			sb.append(A[i] + " ");
		}

		System.err.println(sb.toString().trim());
		System.err.println(count);

	}

	private static void mergeSort(int[] A,int left,int right){
		if(left + 1 < right){
			int mid = (right + left) / 2;
			mergeSort(A,left,mid);
			mergeSort(A,mid,right);
			merge(A,left,mid,right);
		}
	}

	private static void merge(int[] A,int left,int mid,int right){
		for(int i = 0 ; i < mid - left ; i++) l[i] = A[left + i];
		for(int i = 0 ; i < right - mid ; i++) r[i] = A[mid + i];
		l[mid - left] = r[right - mid] = sentinel;

		int x = 0;
		int y = 0;

		for(int i = left ; i < right; i++ ){
			if(l[x] <= r[y]){
				A[i] = l[x++];
			}else{
				A[i] = r[y++];
			}
			count++;
		}
	}

}