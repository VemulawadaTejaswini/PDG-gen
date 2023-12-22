import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int N[] = new int[n];
		int count = 0;
		
		for (int i = 0; i <= n - 1; i++) {
			int x = scanner.nextInt();
			N[i] = x;
		}
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (N[j - 1] > N[j]) {
                    int a = N[j - 1];
                    N[j - 1] = N[j];
                    N[j] = a;
                    count++;
                }
            }
        }
		for (int k = 0; k < n - 1; k++) {
			System.out.print (N[k] + " ");
			}
		System.out.println (N[n - 1]);
        System.out.println(count);
    }
}
