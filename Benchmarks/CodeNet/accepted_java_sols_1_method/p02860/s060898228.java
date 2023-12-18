import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        boolean result = true;

        if (n % 2 == 1) {
            result = false;
        } else {
            String left = s.substring(0, n / 2);
            String right = s.substring(n / 2, n);
            if (!left.equals(right)) {
                result = false;
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}