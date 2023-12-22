import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String str = s.next();

        String answer;

        if (n % 2 != 0)
            answer = "No";
        else {
            String first = str.substring(0, n / 2);
            String second = str.substring(n / 2);

            answer = first.equals(second) ? "Yes" : "No";
        }

        System.out.println(answer);
    }
}