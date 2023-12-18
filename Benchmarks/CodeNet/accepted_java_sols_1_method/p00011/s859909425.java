import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = Integer.parseInt(sc.next());
        List<Integer> amida = new ArrayList<>();

        for (int i = 1; i <= w; i++) {
            amida.add(i);
        }


        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            String S = sc.next();

            int a = Integer.parseInt(S.split(",")[0]);
            int b = Integer.parseInt(S.split(",")[1]);

            Collections.swap(amida, a - 1, b - 1);
        }
        amida.forEach(System.out::println);
    }
}