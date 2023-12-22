import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int check=0;
		for (int i = 0; i < N; i++) {
			if ((i + 1) % 2 == 1 && a[i] % 2 == 1) {
				check++;
			}
		}
		System.out.println(check);
	}

}
