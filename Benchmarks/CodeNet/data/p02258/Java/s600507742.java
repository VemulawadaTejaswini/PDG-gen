import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        Integer minValue = Integer.parseInt(scanner.next());
        Integer maxDiff = -1000000001;
        for (int i = 1; i < n; i++) {
            int value = Integer.parseInt(scanner.next());
            maxDiff = Math.max(maxDiff, value - minValue);
            minValue = Math.min(minValue, value);
        }
        System.out.println(maxDiff);
    }
}