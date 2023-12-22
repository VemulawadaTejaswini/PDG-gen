import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        String[] str = s.split("");
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        List<Integer> ac = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            l.add(sc.nextInt());
            r.add(sc.nextInt());
        }

        for (int i = 0; i < n - 1; i++) {
            int prev;
            if (i == 0) {
                prev = 0;
            } else {
                prev = ac.get(i - 1);
            }
            if ("A".equals(str[i]) && "C".equals(str[i + 1])) {
                ac.add(prev + 1);
            } else {
                ac.add(prev);
            }
        }
        for (int i = 0; i < q; i++) {
            int start = l.get(i);
            int end = r.get(i);
            if (start == 1) {
                System.out.println(ac.get(end - 2));
            } else {
                System.out.println(ac.get(end - 2) - ac.get(start - 2));
            }
        }
    }

}
