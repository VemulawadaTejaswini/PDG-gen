import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String[] s = sc.next().split("");
        int zero = 0;
        int one = 0;

        for (String value : s) {
            if (value.equals("0")) {
                zero++;
            } else {
                one++;
            }
        }

        System.out.println(2 * Math.min(zero, one));
    }
}
