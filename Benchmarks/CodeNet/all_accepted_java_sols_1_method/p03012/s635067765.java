import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int[] w = new int[n];
        int sum1 = 0, sum2 = 0, min = 0;
        
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            sum1 += w[i];
        }

        min = sum1;
for (int i = 0; i < n; i++) {
    sum1 -= w[i];
    sum2 += w[i];
        if (Math.abs(sum1 - sum2) < min) {
            min = Math.abs(sum1 - sum2);
        }
    }
        System.out.println(min);
        

		sc.close();
	}
}
