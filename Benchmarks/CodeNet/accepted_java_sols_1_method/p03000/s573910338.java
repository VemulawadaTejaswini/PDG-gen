import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int D = 0;
		int kaisu = 0;
		for(int i = 0; i < N; i++) {
			D += sc.nextInt();
			if (D <= X) {
				kaisu += 1;
			}
			else {
				break;
			}
		}
		System.out.println(kaisu + 1);
	}
}