import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = 0;
        for (int i = 1; i < n + 1; i++) {
            if (i <= k) {
                result += x;
                continue;
            }
            result += y;
        }
        System.out.println(result);
    }

}
