import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Integer> numMap = new HashMap<>();
        int[] numList = new int[N];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            Integer count = numMap.get(num);
            if (Objects.isNull(count)) {
                numMap.put(num, 1);
            } else {
                numMap.put(num, count + 1);
            }
            numList[i] = num;
        }

        long allPatterns = 0;
        for (Integer count : numMap.keySet()) {
            long counts = numMap.get(count);
            if (counts <= 1) {
                allPatterns += 0;
            } else {
                allPatterns += counts * (counts - 1L) / 2L;
            }
        }
        for (int var : numList) {
            System.out.println(allPatterns - (long) (numMap.get(var) - 1));
        }
        sc.close();
    }

}
