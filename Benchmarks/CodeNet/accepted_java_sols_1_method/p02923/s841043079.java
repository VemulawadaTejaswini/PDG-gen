import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int a[] = new int[N];

		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}

		int max = 0;
		int count = 0;

		for(int i  = 0; i < N - 1; i++) {
			if(a[i + 1] <= a[i]) {
				count++;
			}else {
				count = 0;
			}
			if(max < count) {
				max = count;
			}
		}
		System.out.println(max);
	}
}