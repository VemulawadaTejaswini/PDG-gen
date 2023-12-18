import java.util.*;

public class Main {
    static int modP = 1000000007;
    static long inf  = 1 << 61;
    static int[] x4 = {-1, 0, 0, 1};
    static int[] y4 = {0, -1, 1, 0};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] W = new String[n];
        for(int i = 0; i < n; i++) W[i] = in.next();
        Set<String> words = new HashSet<>();

        words.add(W[0]);
        for(int i = 1; i < n; i++) {
            if(words.contains(W[i])) {
                System.out.println("No");
                return;
            }

            if(W[i].charAt(0) != W[i-1].charAt(W[i-1].length()-1)) {
                System.out.println("No");
                return;
            }

            words.add(W[i]);
        }

        System.out.println("Yes");
    }
}