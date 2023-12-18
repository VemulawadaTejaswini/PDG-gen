import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            aList.add(sc.nextInt());
        }

        int min = Collections.min(aList);
        int max = Collections.max(aList);
        long total = aList.stream().map(a -> (long) a).reduce((a, b) -> a + b).get();

        System.out.printf("%d %d %d\n", min, max, total);

        sc.close();
    }
}
