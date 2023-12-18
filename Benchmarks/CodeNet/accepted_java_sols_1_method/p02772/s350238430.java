import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC155B - Papers, Please

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        String ans = "APPROVED";
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                if (a[i] % 3 == 0 || a[i] % 5 == 0) {

                } else {
                    ans = "DENIED";
                }
            }
        }

        System.out.println(ans);
    }
}