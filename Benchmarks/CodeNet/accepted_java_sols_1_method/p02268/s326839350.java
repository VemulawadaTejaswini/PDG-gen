import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            s.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < q; i++) {
            int t = scanner.nextInt();
            if (s.contains(t)) {
                result++;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}

