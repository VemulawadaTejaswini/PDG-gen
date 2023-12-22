import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            points[i] = new int[] {sc.nextInt(), sc.nextInt()};
            for (int j = 0; j < i; j++)
                sum += Math.sqrt(Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));
        }
        System.out.println(sum * 2 / n);
    }
}
