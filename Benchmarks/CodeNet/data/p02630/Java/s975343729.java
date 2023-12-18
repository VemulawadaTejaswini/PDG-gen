import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<Integer, Long> map = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            map.put(A,map.getOrDefault(A,0L)+1L);
            sum += A;
        }
        StringBuilder ans = new StringBuilder();
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (!map.containsKey(B)) {
                ans.append(sum).append('\n');
                continue;
            }
            long cnt = map.get(B);
            sum -= (long)cnt*B;
            sum += (long)cnt*C;
            map.put(C,map.getOrDefault(C,0L)+cnt);
            ans.append(sum).append('\n');
        }

        System.out.print(ans);
    }
}

