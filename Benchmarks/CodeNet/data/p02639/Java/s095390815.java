import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        for (int i = 1; i <= 5; i++) {
            int k = sc.nextInt();

            if (k == 0) {
                ans = i;
            }
        }

        System.out.println(ans);
    }
}