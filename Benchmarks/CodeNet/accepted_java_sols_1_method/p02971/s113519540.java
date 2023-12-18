import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] org = new int[n];
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            org[i] = tmp;
            a.add(tmp);
        }
        Collections.sort(a, (e1, e2) -> e2 - e1);

        for (int i = 0; i < n; i++) {
            int candidate = a.get(0);
            if (org[i] == candidate) {
                candidate = a.get(1);
            }
            System.out.println(candidate);
        }

        sc.close();
    }

}
