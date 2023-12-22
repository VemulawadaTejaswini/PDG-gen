import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int M = Integer.parseInt(s.next());
        boolean[] completed = new boolean[N];
        int[] wa = new int[N];
        int acCount = 0;
        int waCount = 0;
        for (int i = 0; i < M; i++) {
            int p = Integer.parseInt(s.next()) - 1;
            if (completed[p]) {
                s.next();
                continue;
            }
            String S = s.next();
            if (Objects.equals(S, "WA")) {
                wa[p]++;
            } else {
                acCount++;
                waCount += wa[p];
                completed[p] = true;
            }
        }
        System.out.println(acCount + " " + waCount);
    }

}
