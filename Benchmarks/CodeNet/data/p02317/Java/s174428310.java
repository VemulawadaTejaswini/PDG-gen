import java.util.Scanner;
class LongestIncreasingSubsequence {
    int[] a;
    LongestIncreasingSubsequence (int[] a) {
	this.a = a;
    }
    int solve (int n) {
	int[] len = new int[n];
	int length = 1;
	len[0] = a[0];
	for (int i = 1; i < n; i++) {
	    if (len[length - 1] < a[i]) {
		len[length++] = a[i];
	    } else {
		int pos = binarySearch(len, a[i], length - 1);
		len[pos] = a[i];
	    }
	}
	return length;
    }
    int binarySearch (int[] len, int a, int last) {
	int first = 0, middle;
	while (first <= last) {
	    middle = (first + last) / 2;
	    if (len[middle] < a) {
		first = middle + 1;
	    } else {
		last = middle - 1;
	    }
	}
	return first;
    }
}

public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    a[i] = Integer.parseInt(scan.nextLine());
	}
	LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence(a);
	System.out.println(lis.solve(n));
    }
}