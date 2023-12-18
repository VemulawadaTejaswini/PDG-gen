public class Main {

	public static void main(String[] args) {
		int n = 10;

		int a[] = {838,758,627,515,419,212,113,86,51,10};
		for (int i = 0; i < n; i++) {
			if (i != n-1) {
				System.out.print(a[i] + " ");
			} else {
				System.out.println(a[i]);
			}
		}

	}

}