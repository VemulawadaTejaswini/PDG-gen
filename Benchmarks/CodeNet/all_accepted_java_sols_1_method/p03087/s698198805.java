import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), Q = in.nextInt();
        in.nextLine();
        char[] S = in.nextLine().toCharArray();
        int[] l = new int[Q];
        int[] r = new int[Q];
        for (int i = 0; i < Q; i++) {
            l[i] = in.nextInt();
            r[i] = in.nextInt();
        }
        int[] ac = new int[N + 1];
        for (int i = 1; i < N; i++) {
            ac[i] = ac[i - 1] + (S[i - 1] == 'A' && S[i] == 'C' ? 1 : 0);
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(ac[r[i] - 1] - ac[l[i] - 1]);
        }
    }
}