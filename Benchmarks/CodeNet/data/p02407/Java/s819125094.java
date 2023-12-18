import java.util.Scanner;

public class Main {

	void main() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < a.length ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("" +a[n-1]);
		
		for(int i = a.length - 2; i >= 0 ; i--) {
			System.out.print(" " +a[i]);
		}
        System.out.println();
	}
	public static void main(String[] args) {
		new Main().main();
	}

}
