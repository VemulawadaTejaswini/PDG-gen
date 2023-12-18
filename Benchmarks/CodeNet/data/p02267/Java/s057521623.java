import java.util.Scanner;
 
public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
 
        int q = scanner.nextInt();
        int[] patterns = new int[q];
        for (int i = 0; i < q; i++) {
            patterns[i] = scanner.nextInt();
        }
 
        int count = 0;
        for (int i = 0; i < q; i++) {
            int pattern = patterns[i];
            for (int j = 0; j < n; j++) {
                if (pattern == numbers[j]) {
                    ++count;
                    break;
                }
            }
        }
 
        System.out.println(count);
    }
}