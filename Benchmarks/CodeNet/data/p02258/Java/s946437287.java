import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        List<Integer> list = new ArrayList<>();
        int max;

        int r0 = Integer.parseInt(scanner.next());
        int r1 = Integer.parseInt(scanner.next());
        max = r1 - r0;
        list.add(r0);
        list.add(r1);

        for (int i = 2; i < n; i++) {
            int ri = Integer.parseInt(scanner.next());
            int min = Collections.min(list);
            if (ri - min > max) {
                max = ri - min;
            }
            list.add(ri);
        }

        System.out.println(max);
    }
}