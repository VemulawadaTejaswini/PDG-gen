import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by nakatsukatakahiro on 2017/06/11.
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int tmp = scanner.nextInt();
            sum += tmp;
            if (tmp % 10 != 0) {
                a.add(tmp);
            }
        }
        a.sort(Comparator.naturalOrder());

        int i = 0;
        while (sum % 10 == 0 && i < a.size()) {
            sum -= a.get(i);
            i++;
        }
        if (sum % 10 == 0) {
            sum = 0;
        }

        System.out.println(sum);
    }
}
