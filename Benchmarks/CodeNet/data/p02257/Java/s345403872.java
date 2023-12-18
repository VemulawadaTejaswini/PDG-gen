import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(scanner.next()));
        }
        list.sort(Comparator.naturalOrder());

        List<Integer> sieve = new ArrayList<>();
        for (int i = 2; i <= list.get(list.size() - 1); i++) {
            sieve.add(i);
        }
        for (int i = 0; ; i++) {
            if (i > sieve.size() - 1) {
                break;
            }
            int minp = sieve.get(i);
            for (int j = 2; ; j++) {
                int removed = minp * j;
                if (removed > sieve.get(sieve.size() - 1)) {
                    break;
                }
                sieve.remove((Integer)removed);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (!sieve.contains(list.get(i))) {
                list.remove(list.get(i));
            }
        }

        System.out.println(list.size());
    }
}