
import java.util.Scanner;
public class Main{
	public  static int count = 0;
	public  static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 要素の個数
		int[] num = new int[n]; // 個数のリスト

		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}
		// merge(num,0,5,10) ;
		int[] A = mergeSort(num,0,n);
		for(int i = 0;i < n;i++){
			if(i != n-1){
				System.out.print(A[i]+" ");
			}else{
				System.out.println(A[i]);
			}
		}

		System.out.println(count);
	}
	/**
	 * 比較してソートする
	 * @param A	ソートするリスト
	 * @param left	ソート対象の一番左側のリスト番号
	 * @param mid	分割地点
	 * @param right	ソート対象の一番右側のリスト番号
	 */
	public static void merge(int[] A,int left,int mid,int right){
		int n1 = mid -left;
		int n2 = right -mid;
		int[] L =new int[n1+1];
		int[] R =new int[n2+1];
		L[n1] = 1000000000;//∞
		R[n2] = 1000000000;//∞
		for(int i = 0;i<n1;i++){

			L[i] = A[left+i];
		}
		for(int i = 0;i<n2;i++){	  
			R[i] = A[mid+i];
		}

		int i = 0;
		int j = 0;
		for(int k = left; k<right;k++ ){
			count++;
			if(L[i] <= R[j]){
				A[k] = L[i];
				i = i+1;
			}else{
				A[k] = R[j];
				j = j+1;
			}

		}


	}
	/**
	 *  マージソート
	 * @param A	ソートするリスト
	 * @param left　ソート対象の一番左側のリスト番号
	 * @param right　ソート対象の一番右側のリスト番号
	 * @return
	 */
	private static int[]   mergeSort(int[] A, int left, int right){
		if(left +1 < right){

			int mid = (left + right) /2;
			mergeSort(A,left,mid);
			mergeSort(A,mid , right);
			merge(A,left,mid,right);
		}
		return A;
	}
}

