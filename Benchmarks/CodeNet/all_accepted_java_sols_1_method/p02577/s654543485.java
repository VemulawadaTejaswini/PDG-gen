import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        char[] n = scanner.next().toCharArray();

        long sum = 0;

        for (char v: n
             ) {
           int t = Character.getNumericValue(v);
           sum += t;
        }

        System.out.println(sum % 9 == 0 ? "Yes" : "No");
    }
}