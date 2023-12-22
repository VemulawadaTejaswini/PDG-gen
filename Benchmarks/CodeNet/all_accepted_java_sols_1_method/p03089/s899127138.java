import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), ans[] = new int[n];
        List<Integer> b = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .collect(Collectors.toList());
        while (n > 0)
            for (int i = n, d = 0; i > 0 && n > d; i--)
                switch (Integer.compare(b.get(i - 1), i)) {
                    case 1:
                        System.out.println(-1);
                        return;
                    case 0:
                        ans[--n] = b.get(i - 1);
                        b.remove(i - 1);
                        continue;
                    case -1:
                        d = Math.max(d, n - i + b.get(i - 1));
                }
        for (int i : ans)
            System.out.println(i);
    }
}