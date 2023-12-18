import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner stdin = new Scanner(System.in)) {
            String numText = stdin.next();
            long num = Long.parseLong(numText);
            long sum = numText.chars().mapToLong(c -> c - '0').sum();
            System.out.println((num % sum == 0) ? "Yes" : "No");
        }
    }
}
