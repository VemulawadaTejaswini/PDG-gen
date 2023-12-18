import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int max = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            int p = scanner.nextInt();
            sum += p;
            if (max < p) {
                max = p;
            }
        }

        System.out.println(sum - max / 2);
    }

}
