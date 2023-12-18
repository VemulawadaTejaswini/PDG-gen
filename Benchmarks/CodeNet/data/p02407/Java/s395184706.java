public class Main {

	public static void main(String[] args) {
		int n = 10;

		int a[] = {838,758,113,515,51,627,10,419,212,86};
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < (n - 1) - i; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (i != n-1) {
				System.out.print(a[i] + " ");
			} else {
				System.out.println(a[i]);
			}
		}

	}

}