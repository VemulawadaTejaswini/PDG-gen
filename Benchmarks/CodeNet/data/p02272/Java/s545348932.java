import java.util.*;
import java.io.*;

class Main {

	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] str = line.split(" ");
		int[] a = new int[n];

		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}

		margeSort(a,0,n);

		StringBuilder sb = new StringBuilder();
		sb.append(a[0]);
		for (int i=1; i<n; i++) {
			sb.append(" ").append(a[i]);
		}
		System.out.println(sb);
		System.out.println(count);

		br.close();
	}

	static void marge(int[] a,int left,int mid,int right){
		int n1 = mid - left;
		int n2 = right - mid;
		int[] L = new int[n1+1];
		int[] R = new int[n2+1];
		for (int i=0; i<n1; i++) {
			L[i] = a[left+i];
		}
		for (int i=0; i<n2; i++) {
			R[i] = a[mid+i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k=left; k<right; k++) {
			count++;
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			}else {
				a[k] = R[j];
				j++;
			}
		}
	}

	static void margeSort(int[] a,int left,int right){
		if (left+1 < right) {
			int mid = (left+right)/2;
			margeSort(a,left,mid);
			margeSort(a,mid,right);
			marge(a,left,mid,right);
		}
	}
}