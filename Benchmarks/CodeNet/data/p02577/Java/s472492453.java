import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.next();
        if (s.equals("0")) {
            System.out.println("Yes");
            return;
        }

        long sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum += c;
        }

        if (sum % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}