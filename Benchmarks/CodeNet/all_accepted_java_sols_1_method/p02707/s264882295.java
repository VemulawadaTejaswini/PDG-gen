import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 1; i < N; i++) {
            int boss = sc.nextInt();
            Integer count = resultMap.get(boss);
            if (Objects.isNull(count)) {
                count = 1;
            } else {
                count += 1;
            }
            resultMap.put(boss, count);
        }

        for (int i = 1; i <= N; i++) {
            Integer val = resultMap.get(i);
            if (Objects.isNull(val)) {
                System.out.println(0);
            } else {
                System.out.println(val);
            }
        }
    }
}
