import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int max = 0;
		int Hlist[] = new int[N];
		for(int i = 0; i < N; i++) {
			Hlist[i] = sc.nextInt();
		}
		for (int i = 0; i < N - 1; i++) {
			if (Hlist[i] >= Hlist[i + 1]) {
				count++;
			} else {
				count = 0;
			}
			if (max < count) {
				max = count;
			}
		}
		System.out.println(max);
	}

}