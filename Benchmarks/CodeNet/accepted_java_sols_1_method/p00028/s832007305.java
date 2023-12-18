import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] map = new int[100 + 1];

        for (int i = 0; i < map.length; i++) map[i] = 0;

        while (sc.hasNext()) map[Integer.parseInt(sc.next())]++;

        List<Integer> maxIndex = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < map.length; i++) {
            if (map[i] >= max) {
                max = map[i];
            }
        }

        for (int i = 0; i < map.length; i++) {
            if (map[i] == max) maxIndex.add(i);
        }

        maxIndex.forEach(System.out::println);
    }
}