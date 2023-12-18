import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		Main bs = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		bs.babble(array);
	}
	public void babble(int[] a) {
		int count = 0;
		for (int j = 1; j < a.length; j++) {

			for (int i = a.length - 1; i >= j; i--) {
				if (a[i] < a[i - 1]) {
					int past = a[i];
					a[i] = a[i - 1];
					a[i - 1] = past;
					count++;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			System.out.print (a[i]);
			if (i != a.length - 1) {
				System.out.print(" ");
			}else {
				System.out.println("");
			}
		}
		System.out.println(count);
	}
}

