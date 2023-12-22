import java.util.Scanner;

public class Main {

    public static int aa = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            sum += tmp;
            max = Math.max(max, tmp);
        }

        sum -= max / 2;
        System.out.println(sum);
    }
}