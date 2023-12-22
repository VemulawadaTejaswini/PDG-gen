import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (max < tmp) {
                max = tmp;
            }
            sum += tmp;
        }
        sc.close();
        sum -= max / 2;

        System.out.println(sum);

    }
}