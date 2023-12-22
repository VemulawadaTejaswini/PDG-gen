import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        long ans = 0;
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
            ans += (long) a[i];
        }



        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < n ; i++) {
            while (a[i] > 0) {
                list.add(a[i] - a[i]/2);
                a[i] /= 2;
            }
        }

        Collections.sort(list);

        long sum = 0;
        for (int i = 0 ; i < m ; i++) {
            if (i < list.size()) {
                sum += (long) list.get(list.size() - 1 - i);
            }

        }

        System.out.println(ans - sum);

    }

}