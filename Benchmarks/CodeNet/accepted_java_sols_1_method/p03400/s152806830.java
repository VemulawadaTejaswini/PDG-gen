import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();

		int a[] = new int[105];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}


		int choco = 0;

		for (int i = 0; i < n; i++) {
			int days = 1;
			do {
				choco += 1;
				days += a[i];
			}while(days <= d);
		}

		choco += x;

		System.out.println(choco);
	}
}
