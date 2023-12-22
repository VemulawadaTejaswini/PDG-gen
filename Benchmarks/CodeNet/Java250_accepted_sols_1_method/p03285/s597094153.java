import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // B - Cakes and Donuts

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String ans = "No";
        loop:
        for (int i = 0; i <= n / 4; i++) {
            for (int j = 0; j <= n / 7; j++) {
                if (i * 4 + j * 7 == n) {
                    ans = "Yes";
                    break loop;
                }
            }
        }

        System.out.println(ans);
    }

}