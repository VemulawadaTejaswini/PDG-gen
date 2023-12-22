import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(sc.nextLine()));
        }

        int ans = 0;
        int before = 0;
        for (Integer current : set) {
            if (before < current) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
