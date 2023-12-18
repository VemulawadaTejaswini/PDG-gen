import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int kashicounts[] = new int[N+1];
		for (int i = 0; i < K; i++) {
			int di = sc.nextInt();
			for (int j = 0; j < di; j++) {
				int kashicountpeople = sc.nextInt();
				kashicounts[kashicountpeople]++;
			}
		}
		
		int count=0;
		for (int i = 1; i < N+1; i++) {
			if (kashicounts[i] == 0) {
				count++;
			}
		}		
		
		System.out.println(count);
	}		
}
