import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] steps = new int[n];
        for (int i = 0; i < n; i++) {
            steps[i] = sc.nextInt();
        }

        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            long score = 0;
            int cur = i;
            for (int j = 0; j < k; j++) {
                cur = steps[cur] - 1;
                score += scores[cur];
                max = Math.max(max, score);
            }
        }
        System.out.println(max);
	}
}