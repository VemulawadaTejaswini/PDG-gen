import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        final String YES_STR = "Yes";
        final String NO_STR = "No";
        if (y % 2 == 1) {
            System.out.println(NO_STR);
            return;
        }

        int totalFoot = 0;
        // [i]を亀の数、[x-i]を鶴の数とする
        for (int i = 0 ; i <= x ; i++) {
            totalFoot = (i * 4) + ((x - i) * 2);

            if (totalFoot == y) {
                System.out.println(YES_STR);
                return;
            }
        }
        System.out.println(NO_STR);
    }
}