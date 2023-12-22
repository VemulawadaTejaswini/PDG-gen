import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            int leftCount = 0;
            int rightCount = 0;
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                if (a < x) {
                    leftCount++;
                } else {
                    rightCount++;
                }
            }

            int ans = Math.min(leftCount, rightCount);
            System.out.println(ans);
        }
    }

}
