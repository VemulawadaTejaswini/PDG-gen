import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(v);

        double value = v.remove(0);
        for (int i = 0; i < n - 1; i++) {
            value = (value + v.remove(0)) / 2.0;
        }
        System.out.println(value);
    }

}
