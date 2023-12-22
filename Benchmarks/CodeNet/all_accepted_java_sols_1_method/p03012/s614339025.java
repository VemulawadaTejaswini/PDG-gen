import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            sum += w[i];
        }
        int minDiff = Integer.MAX_VALUE;
        int group1 = 0;
        int group2 = sum;
        for (int i = 0; i < n - 1; i++) {
            group1 += w[i];
            group2 -= w[i];
            minDiff = Math.min(Math.abs(group1 - group2), minDiff);
        }
        System.out.println(minDiff);
    }

}
