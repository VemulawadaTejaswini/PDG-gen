import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> d = new ArrayList();

        for (int i = 0; i < N; i++) {
            d.add(sc.nextInt());
        }
        sc.close();
        System.out.println(d.stream().distinct().count());
    }
}