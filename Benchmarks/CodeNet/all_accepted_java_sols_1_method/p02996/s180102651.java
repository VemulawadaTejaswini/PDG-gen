import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] AList = new long[N];
        long[] BList = new long[N];

        for (int i=0; i < N; i++) {
            AList[i] = scanner.nextInt();
            BList[i] = scanner.nextInt();
        }

        Map<Long, Long> simekiriMap = new HashMap<>();
        for (int i=0; i < N; i++) {
            if (simekiriMap.containsKey(BList[i])) {
                simekiriMap.put(BList[i], simekiriMap.get(BList[i]) + AList[i]);
            } else {
                simekiriMap.put(BList[i], AList[i]);
            }
        }

        List<Map.Entry<Long, Long>> entryList = new ArrayList<>(simekiriMap.entrySet());
        entryList.sort((o1, o2) -> {
            long result = o1.getKey() - o2.getKey();
            if (result > 0) {
                return 1;
            } else if (result < 0) {
                return -1;
            }
            return 0;
        });

        long sum = 0;
        for (Map.Entry<Long, Long> entry : entryList) {
            if (entry.getKey() < entry.getValue() + sum) {
                System.out.println("No");
                return;
            }
            sum += entry.getValue();
        }

        System.out.println("Yes");
    }
}