import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int []a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int cnt = 0;
		for(int i = 0; i < N - 1; i++) {
			if(a[i] == a[i + 1]) {
				cnt ++;
				a[i + 1] = 10000 - i;
			}
		}
		System.out.println(cnt);

	}
}