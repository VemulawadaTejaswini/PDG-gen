import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        a.sort(Collections.reverseOrder());
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum += a.get(i / 2);
        }
        System.out.println(sum);
    }

}
