import java.util.Scanner;
public class Main {
    static int cnt = 0;
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] s = new int[n];
	String[] inputS = scan.nextLine().split(" ");
	for (int i = 0; i < n; i++) {
	    s[i] = Integer.parseInt(inputS[i]);
	}
	mergeSort(s, 0, s.length);
	for (int i = 0; i < n - 1; i++) {
	    System.out.print(s[i] + " ");
	}
	System.out.println(s[n-1]);
	System.out.println(cnt);
    }
    public static void merge(int[] a, int left, int mid, int right) {
	int n1 = mid - left;
	int n2 = right - mid;
	int[] L = new int[n1+1];
	int[] R = new int[n2+1];
	for (int i = 0; i < n1; i++) {
	    L[i] = a[left + i];
	}
	for (int i = 0; i < n2; i++) {
	    R[i] = a[mid + i];
	}
	L[n1] = Integer.MAX_VALUE;
	R[n2] = Integer.MAX_VALUE;
	int i = 0, j = 0;
	for (int k = left; k < right; k++) {
	    cnt++;
	    if (L[i] <= R[j]) {
		a[k] = L[i];
		i = i + 1;
	    } else {
		a[k] = R[j];
		j = j + 1;
	    }
	}
    }
    public static void mergeSort(int[] a, int left, int right) {
	if (left + 1 < right) {
	    int mid = (left + right) / 2;
	    mergeSort(a, left, mid);
	    mergeSort(a, mid, right);
	    merge(a, left, mid, right);
	}
    }
}