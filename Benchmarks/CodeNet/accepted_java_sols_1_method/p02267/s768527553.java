import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.next();
        }

        int q = scanner.nextInt();
        String[] patterns = new String[q];
        for (int i = 0; i < q; i++) {
            patterns[i] = scanner.next();
        }

        int count = 0;
        for (int i = 0; i < q; i++) {
            String pattern = patterns[i];
            for (int j = 0; j < n; j++) {
                if (pattern.equals(numbers[j])) {
                    ++count;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}