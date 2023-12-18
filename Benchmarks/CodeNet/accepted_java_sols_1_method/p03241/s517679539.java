import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int maxPossibleVal = m / n;
        if (m % n == 0) {
            System.out.println(maxPossibleVal);
            return;
        }
        int ans = 1;
        for (int i=2; i<=maxPossibleVal; i++) {
            if (m % i == 0) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
