import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m > n) {
            System.out.println("No");
            sc.close();
            return;
        }
        int sum = 0;
        int[] rating = new int[n];
        for (int i = 0; i < n; i++) {
        	rating[i] = sc.nextInt();
        	sum += rating[i];
        }
        Arrays.sort(rating);
        double minimumVote = (double)sum / 4.0 / (double)m;
        for (int i = n - m; i < n; i++) {
        	if (rating[i] < minimumVote) {
        		System.out.println("No");
        		sc.close();
        		return;
        	}
        }
        System.out.println("Yes");
        sc.close();
    }
}