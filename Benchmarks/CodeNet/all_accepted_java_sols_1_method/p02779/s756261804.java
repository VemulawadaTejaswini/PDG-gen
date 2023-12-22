import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Long> list = new HashSet<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }

        System.out.println(list.size() == n ? "YES" : "NO");
    }
}
