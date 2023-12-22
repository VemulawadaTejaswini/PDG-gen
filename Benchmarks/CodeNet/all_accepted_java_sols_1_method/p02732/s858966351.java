import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Long> HM = new HashMap<>();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            A[i] = tmp;
            if (HM.containsKey(tmp)) {
                HM.put(tmp, HM.get(tmp) + 1L);
            } else {
                HM.put(tmp, 1L);
            }
        }
        Long sum = 0L;
        for (int s : HM.keySet()) {
            Long tmp = HM.get(s);
            sum = sum + tmp * (tmp - 1) / 2;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(sum - HM.get(A[i]) + 1);

        }

    }
}