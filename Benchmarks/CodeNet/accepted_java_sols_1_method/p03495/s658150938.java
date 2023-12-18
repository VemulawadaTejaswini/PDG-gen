import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k = scanner.nextInt();
        int[] balls = new int[n + 1];

        for (int i = 0; i < n; i++) balls[scanner.nextInt()]++;


        Arrays.sort(balls);
        int totalK = 0;
        for (int i = n; i >= n + 1 - k; i--) totalK += balls[i];
        System.out.println(n - totalK);
    }
}
