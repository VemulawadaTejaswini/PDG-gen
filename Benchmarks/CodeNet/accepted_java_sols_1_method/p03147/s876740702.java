import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) h[i] = scanner.nextInt();
        List<Integer> hList = Arrays.stream(h).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int max = hList.get(0);

        int count = 0;
        int[] flowers = h;
        for (int i = 0; i < max; i++) {
            StringBuilder builder = new StringBuilder();
            for (int flower : flowers) builder.append(flower > 0 ? String.valueOf(flower).replace("0", "A") : flower);
            count += Arrays.stream(builder.toString().split("0")).filter(s -> !s.trim().equals("")).count();

            for (int j = 0; j < N; j++) {
                if (flowers[j] > 0) flowers[j]--;
            }
        }

        System.out.println(count);
    }

}
