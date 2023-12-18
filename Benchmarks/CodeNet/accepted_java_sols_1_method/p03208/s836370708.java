import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int diff = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sc.close();

        Collections.sort(list);

        for (int i = 0; i < n - k + 1; i++) {
            int min = list.get(i);
            int max = list.get(i + k - 1);
            int tmp = max - min;
            if (diff > tmp) {
                diff = tmp;
            }
        }

        System.out.println(diff);

    }
}