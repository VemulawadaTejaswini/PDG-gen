import java.util.Scanner;

public class Main {
	int n;
	int array[];
	int cnt;
	public static void main(String args[]) {
		new Main().run();
	}
	Main() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
	}
	void run() {
		mergeSort(0,n);
		System.out.println(cnt);
	}
	void mergeSort(int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right ) / 2;
			mergeSort(left, mid);
			mergeSort(mid, right);
			merge(left, mid, right);
		}
	}
	void merge(int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int l[] = new int[n1+1];
		int r[] = new int[n2+1];
		for (int i = 0; i < n1; i++) {
			l[i] = array[left + i];
		}
		for (int i = 0; i < n2; i++) {
			r[i] = array[mid + i];
		}
		l[n1] = Integer.MAX_VALUE;
		r[n2] = Integer.MAX_VALUE;
		int i = 0;
		int j = 0;
		for (int k = left; k < right; k++) {
			if (l[i] <= r[j]) {
				array[k] = l[i];
				i++;
			} else {
				array[k] = r[j];
				j++;
				cnt +=  n1 - i;
			}
		}
	}

}

