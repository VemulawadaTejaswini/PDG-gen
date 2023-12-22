import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double k = scanner.nextInt();
        double p = 0;

        for(int start = 1 ; start <= n ; start++){
            int count;
            int point = start;

            for(count = 0; point < k ; count++){
                point *= 2;
            }
            p += (1 / n) * (Math.pow(2 , -1 * count));
        }

        System.out.println(p);
    }
}