import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();

        int[] points = new int[n];
        Arrays.fill(points, 0);

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            points[a-1] += 1;
        }
        for (int point: points) {
            System.out.println(k-q+point<=0? "No": "Yes");
        }
    }
}