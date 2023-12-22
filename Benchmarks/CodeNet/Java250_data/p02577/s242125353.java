import java.util.Scanner;

public class Main {
    public boolean isMultipleOfNine(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            sum += digit;
        }

        if (num.length() < 10) {
            return sum % 9 == 0;
        } else {
            return isMultipleOfNine(String.valueOf(sum));
        }
    }

    public static void main(String[] args) throws Exception {
        Main solution = new Main();

        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        boolean answer = solution.isMultipleOfNine(n);
        if (answer) System.out.println("Yes");
        else System.out.println("No");
    }
}