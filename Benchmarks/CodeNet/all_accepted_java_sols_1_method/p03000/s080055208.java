import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[n];
        int sum = 0, cnt = 1;

        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
            sum += l[i];
            if (sum <= x) {
                cnt++;
            }
        }

        System.out.println(cnt);

		sc.close();
	}
}
