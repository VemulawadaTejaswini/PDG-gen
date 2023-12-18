import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = scanner.nextLine().split(" ");
        int N = Integer.valueOf(temp[0]);
        int K = Integer.valueOf(temp[1]);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int h = Integer.valueOf(scanner.nextLine());
            list.add(h);
        }

        list.sort(Comparator.comparingInt(o -> o));
        int ans = 1000000000;
        int sa = N-K+1;
        int size = list.size();
        for (int i = 0; i < sa; i++) {
            int max = list.get(size - 1 - i);
            int min = list.get(sa - 1 - i);
            int t = max - min;
            if (ans > t) {
                ans = t;
            }
        }
        System.out.println(ans);
    }



}
