import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(a, Collections.reverseOrder());

        long sum = a.get(0);
        for (int i = 1; i < N - 1; i++) {
            sum += a.get((i + 1) / 2);
        }

        System.out.println(sum);

        sc.close();

    }
}