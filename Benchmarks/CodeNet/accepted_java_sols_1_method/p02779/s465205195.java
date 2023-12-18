import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            integers.add(sc.nextInt());
        }
        System.out.println(integers.size() == n ? "YES" : "NO");
    }
}
