import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(l);

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += l.get(i);
        }

        if (sum > l.get(n - 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
