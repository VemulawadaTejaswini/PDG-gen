import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        long k = sc.nextLong();

        for (char c : s) {
            int num = Character.getNumericValue(c);

            if (num == 1 && --k == 0) {
                System.out.println(1);
                return;
            }

            if (num != 1) {
                System.out.println(num);
                return;
            }
        }

        System.out.println(1);

    }
}