import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static final int MAX = 500000;
	public static final int SENTINAL = 1000000001;
	public static int[] L = new int[MAX / 2 + 2];
	public static int[] R = new int[MAX / 2 + 2];
	public static int count = 0;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String tmparray[] = br.readLine().split(" ");
		int s[] = new int[n];

		for(int i = 0 ; i < n ; i++){
			s[i] =Integer.parseInt(tmparray[i]);
		}

		mergeSort(s,0,n);
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < n ; i++){
			sb.append(s[i]);
			sb.append(" ");
		}

		System.out.println(sb.toString().trim());
		System.out.println(count);

	}

	public static void mergeSort(int[] s,int left, int right){

		if(right - left == 1){
			return;
		}
		int mid = (right + left) / 2;
		mergeSort(s,left,mid);
		mergeSort(s,mid,right);
 		merge(s,left,mid,right);
	}


	private static void merge(int[] s,int left, int mid, int right){

		for(int i = left ; i < mid ; i++) L[i] = s[i];
		L[mid] = SENTINAL;
		for(int i = mid ; i < right ; i++) R[i] = s[i];
		R[right] = SENTINAL;

		int li = left;
		int ri = mid;
		for(int i = left ; i < right ; i++){
			count++;
			if(L[li] < R[ri]){
				s[i] = L[li++];
			}else{
				s[i] = R[ri++];
			}
		}
	}
}