import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int T = Integer.parseInt(scanner.next());
        int A = Integer.parseInt(scanner.next());

        double ansDiff = Integer.MAX_VALUE;
        int ansIndex = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int h = Integer.parseInt(scanner.next());
            double temperature = T - h * 0.006;

            double diff = Math.abs(temperature - A);
            if (diff < ansDiff) {
                ansDiff = diff;
                ansIndex = i + 1;
            }
        }
        scanner.close();

        System.out.println(ansIndex);
    }
}

