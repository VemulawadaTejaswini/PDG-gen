import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        Map<Long, Long> heightMap = new HashMap<>();
        Map<Long, List<Long>> connectMap = new HashMap<>();
        for (long i = 0; i < N; i++) {
            heightMap.put(i + 1, sc.nextLong());
            connectMap.put(i + 1, new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            List<Long> aList = connectMap.get(A);
            aList.add(heightMap.get(B));
            connectMap.put(A, aList);
            List<Long> bList = connectMap.get(B);
            bList.add(heightMap.get(A));
            connectMap.put(B, bList);
        }

        sc.close();

        long result = 0;
        for (Long key : connectMap.keySet()) {
            List<Long> heighList = connectMap.get(key);
            if (heighList.isEmpty()) {
                result++;
            } else {
                Long height = heightMap.get(key);
                boolean isOK = true;
                for (long val : heighList) {
                    if (val >= height) {
                        isOK = false;
                        break;
                    }
                }
                if (isOK) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

}
