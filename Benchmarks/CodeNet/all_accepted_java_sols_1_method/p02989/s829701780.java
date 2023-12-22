import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long d = sc.nextLong();
            list.add(d);
        }
        Collections.sort(list);

        int index = (list.size() - 1) / 2;
        long min = list.get(index);
        long max = list.get(index + 1);
        System.out.println(max - min);
    }
}