import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(Integer.parseInt(sc.next()), i);
        }

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d ", map.get(i));
        }
    }
}