import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());

        List<Integer> l = new ArrayList<>();
        l.add(X);
        for (int i = 1; i < K; i++) {
            int before = X - i;
            int after = X + i;
            l.add(before);
            l.add(after);
        }

        l.sort(Comparator.naturalOrder());
        for (int i = 0; i < l.size(); i++) {
            if (i <= l.size()) {
                System.out.print(l.get(i) + " ");
            } else {
                System.out.println(l.get(i));
            }
        }
    }
}
