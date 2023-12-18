import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(a);
        List<Integer> li = new ArrayList<Integer>(Arrays.asList(a));

        for (int i = 0; i < n; i++) {

            int x = li.size();
            if (i >= x) {
                break;
            }
            int p = li.get(i);
            for (int j = x - 1; j > i; j--) {

                int o = li.get(j);
                if (o % p == 0) {
                    li.remove(j);
                }
            }
        }

        if (li.size() == 1) {
            int num = li.get(0);
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (num % a[i] == 0) {
                    cnt++;
                }
                if (cnt > 1) {
                    li.remove(0);
                    break;
                }
            }
        }
        System.out.println(li.size());
    }
}