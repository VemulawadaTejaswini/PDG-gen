import java.util.Arrays;
import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            while (tmp % 2 == 0) {
                tmp /= 2;
                count++;
            }
        }
        System.out.println(count);
    }
}