import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int answer = 0;
        for (int x = 0; x <= k; x++)
            answer += (s - x + 1) - Math.min(s - x + 1, Math.max(0, ((s - x - k) * 2)));
        System.out.println(answer);
    }
}