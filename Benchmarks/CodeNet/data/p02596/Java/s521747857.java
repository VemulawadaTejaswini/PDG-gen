import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = 7;
        // a mod k = 0を探索
        for (int i = 0 ; i < k ; i++) {
            if (a % k == 0) {
                System.out.println(i + 1);
                return;
            }
            a %= k;
            a = 10 * a + 7;
        }
        System.out.println(-1);
    }

}
