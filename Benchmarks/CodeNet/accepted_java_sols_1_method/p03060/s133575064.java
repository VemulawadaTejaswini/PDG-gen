import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 0, ans = 0;

		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		int[] benefit = new int[N];
		
		for (int i = 0; i < N; i++) {
			benefit[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			benefit[i] = benefit[i] - scanner.nextInt();
			ans = Math.max(ans, ans + benefit[i]);
		}
		
		scanner.close();
		
		System.out.println(ans);
		
		
	}

}
