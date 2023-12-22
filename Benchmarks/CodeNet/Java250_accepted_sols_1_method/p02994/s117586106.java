import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int sum = 0;
        int min_abs = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int tmp = l + i;
            sum += tmp;
            if (min_abs > Math.abs(tmp)) {
                min = tmp;
                min_abs = Math.abs(tmp);
            }
        }

        System.out.println(sum - min);
    }
}