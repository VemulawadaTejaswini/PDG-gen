import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        long num = Long.parseLong(str);

        ArrayList<Long> list = new ArrayList<>();

        while (true) {
            if (num % 26 == 0) {
                list.add(0, (long)26);
                num /= 26;
            } else
                list.add(0, num % 26);

            if (num / 26 == 0) break;
            else num /= 26;
        }

        for (long i : list) {
            System.out.print((char)(i + 'a' - 1));
        }
        System.out.println();
    }
}
