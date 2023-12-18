import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();


        for (int i = 0; i < m; i++) {
            l.add(scanner.nextInt());
            r.add(scanner.nextInt());
        }

        if (Collections.min(r) >= Collections.max(l)) {
            System.out.println(Collections.min(r) - Collections.max(l) + 1);
        } else {
            System.out.println(0);
        }
    }
}