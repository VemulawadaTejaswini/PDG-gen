import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i=0;i<n;i++) {
            x[i] = sc.nextInt();
        }

        int result = 1;
        for (int i=1;i<n;i++) {
            boolean canSee = true;
            for (int j=0;j<i;j++) {
                if (x[i] < x[j]) {
                    canSee = false;
                    break;
                }
            }
            if (canSee) {
                result++;
            }
        }

        System.out.println(result);
    }
}
