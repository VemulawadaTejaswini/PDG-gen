import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// A - Poor
// https://atcoder.jp/contests/abc155/tasks/abc155_a
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        int C = Integer.parseInt(scanner.next());
        scanner.close();

        Set<Integer> set = new HashSet<>();
        set.add(A);
        set.add(B);
        set.add(C);

        System.out.println(set.size() == 2 ? "Yes" : "No");
    }
}
