import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	void run() {
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		for(int i = n - 1; i > 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[0]);
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		new Main().run();
	}

}