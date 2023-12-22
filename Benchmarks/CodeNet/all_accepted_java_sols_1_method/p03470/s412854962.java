import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashSet<Integer> d = new HashSet();

        for (int i = 0; i < N; i++) {
            d.add(sc.nextInt());
        }
        sc.close();
        System.out.println(d.size());
    }
}