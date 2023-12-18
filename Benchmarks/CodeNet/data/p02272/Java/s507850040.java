import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class Main{
	public static int count = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		String[] str = (br.readLine()).split(" ");
		for (int i = 0; i<n ; i++ ) {
			a[i] = Integer.parseInt(str[i]);
		}
		mergeSort(a,0,n);
		for (int i = 0; i<n ; i++ ) {
			if (i == n-1) {
				System.out.println(a[i]);
			}else{
				System.out.print(a[i] + " ");
			}
		}
		System.out.println(count);

	}

	public static void merge(int[] a , int left , int mid , int right){
		int n1 = mid - left;
		int n2 = right - mid;
		int[] l = new int[n1+1];
		int[] r = new int[n2+1];
		for (int i = 0; i<n1 ; i++ ) {
			l[i] = a[left + i];
		}
		for (int i = 0; i<n2 ; i++ ) {
			r[i] = a[mid + i];
		}
		l[n1] = Integer.MAX_VALUE;
		r[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k = left; k<right ; k++ ) {
			if (l[i] <= r[j]) {
				a[k] = l[i];
				i = i + 1;
				count++;
			}else{
				a[k] = r[j];
				j = j + 1;
				count++;
			}
		}
	}
	public static void mergeSort(int[] a ,int left,int right){
		if (left + 1 < right) {
			int mid = (left + right)/2;
			mergeSort(a,left,mid);
			mergeSort(a,mid,right);
			merge(a,left,mid,right);
		}
	}
}