import java.util.*;

/* No.10029 */
public class Main {
	static void QuickSort(int[] arr,int left, int right) {
		if ( left <= right ) {
			int pivot = arr[(left+right)/2],
			l = left , r = right;			
			while( l <= r ) {
				while ( arr[l] < pivot ) l++;
				while ( arr[r] > pivot ) r--;
				if ( l <= r ) {
					int tmp = arr[l];
					arr[l] = arr[r];
					arr[r] = tmp;
					l++; r--;
				}
			}
			QuickSort(arr,left,r);
			QuickSort(arr,l,right);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[1000000];
		int n = sc.nextInt();
		for ( int i = 0; i < n; i++ )
			data[i] = sc.nextInt();
		QuickSort(data,0,n-1);
		for (int i = 0; i < n-1; i++ )
			System.out.print(data[i]+" ");
		System.out.println(data[n-1]);
	}
}