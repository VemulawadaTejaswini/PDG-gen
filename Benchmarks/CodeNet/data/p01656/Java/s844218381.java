import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] Y = new int[N + 2];
		String[] name = new String[N + 1];
		name[0] = "kogakubu10gokan";
		for (int i = 0; i < N; ++i) {
			Y[i + 1] = sc.nextInt();
			name[i + 1] = sc.next();
		}
		Y[N + 1] = 100;
		for (int i = 0; i < N + 1; ++i) {
			if (Y[i] <= Q && Q < Y[i+1]) {
				System.out.println(name[i]);
				break;
			}
		}
	}

}