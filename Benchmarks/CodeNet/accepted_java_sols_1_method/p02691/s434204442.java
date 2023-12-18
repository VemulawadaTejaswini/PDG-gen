import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        long[] P = new long[n];
        long[] A = new long[n];
        Map<Long, Long> M = new HashMap<>();
        for(int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(sc.next());
            P[i] = A[i] + i + 1;
            if(M.containsKey(i + 1 - A[i])) M.put(i + 1 - A[i], M.get(i + 1 - A[i]) + 1);
            else M.put(i + 1 - A[i], 1L);
        }
        for(int i = 0; i < n; i++) {
            if(M.containsKey(P[i])) {
                res += M.get(P[i]);
                if(P[i] == i + 1 - A[i]) res--;
            }
        }

        System.out.println(res);
    }
}
