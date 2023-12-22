
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            a[i] = scanner.nextInt();
        }
        int deletedNum = 0;
        for (int i = 1; i <= n; ++i) {
            if (a[i] != i - deletedNum) {
                ++deletedNum;
            }
        }
        if (deletedNum == n) {
            deletedNum = -1;
        }
        System.out.println(deletedNum);
    }
}
