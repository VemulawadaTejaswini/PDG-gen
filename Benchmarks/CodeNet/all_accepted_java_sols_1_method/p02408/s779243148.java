import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Boolean> S = new HashMap<>();
        Map<Integer, Boolean> H = new HashMap<>();
        Map<Integer, Boolean> C = new HashMap<>();
        Map<Integer, Boolean> D = new HashMap<>();

        for (int i = 0 ; i < 13; i++) {
            S.put(i, false);
            H.put(i, false);
            C.put(i, false);
            D.put(i, false);
        }

        int N = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            String m = sc.next();
            int n = Integer.parseInt(sc.next());

            switch (m) {
                case "S":
                    S.put(n-1, true);
                    break;
                case "H":
                    H.put(n-1, true);
                    break;
                case "C":
                    C.put(n-1, true);
                    break;
                case "D":
                    D.put(n-1, true);
                    break;
            }
        }

        S.forEach((integer, aBoolean) -> {if (!aBoolean) System.out.printf("S %d\n", integer+1);});
        H.forEach((integer, aBoolean) -> {if (!aBoolean) System.out.printf("H %d\n", integer+1);});
        C.forEach((integer, aBoolean) -> {if (!aBoolean) System.out.printf("C %d\n", integer+1);});
        D.forEach((integer, aBoolean) -> {if (!aBoolean) System.out.printf("D %d\n", integer+1);});
    }
}