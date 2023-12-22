import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // in
            String N = sc.next();

            // calc
            int sum = 0;
            for (char c : N.toCharArray()) {
                sum += Integer.parseInt(String.valueOf(c));
            }
            System.out.println(sum % 9 == 0 ? "Yes" : "No");
        }
    }
}
