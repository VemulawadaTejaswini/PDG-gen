import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), a[] = new int[n];
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < n; j++)
            a[j] = scanner.nextInt();
        for (int j = n - 1; j >= 0; j -= 2)
            ans.add(a[j]);
        for (int j = n & 1; j < n; j += 2)
            ans.add(a[j]);
        System.out.println(ans.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}