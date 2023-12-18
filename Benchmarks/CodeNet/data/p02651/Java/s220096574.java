import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int l = 0; l < T; l++) {
            int N = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < N; i++) {
                int A = sc.nextInt();
                list.add(A);
            }
            int x = 0;
            String S = sc.next();
            for (int k = 0; k < N; k++) {
                if (S.substring(k, k + 1) == String.valueOf(0)){
                    if (list.get(k) == 0 || list.get(k) == 1) {
                        x = 0;
                    }
                } else if (S.substring(k, k + 1) == String.valueOf(1)) {
                    if (list.get(k) == 0 || list.get(k) == 1) {
                        x = 1;
                    }
                }
            }
            System.out.println(x);
        }
    }
}
