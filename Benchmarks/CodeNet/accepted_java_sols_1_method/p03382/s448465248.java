import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        Integer max = a.stream().max(Comparator.naturalOrder()).get();
        a.remove(max);
        Integer m = a.stream().min(Comparator.comparingInt(i -> Math.abs(i - max + i))).get();
        System.out.println(max + " " + m);
    }
}