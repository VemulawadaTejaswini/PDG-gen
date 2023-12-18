import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static final int max = 1_000_001;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        System.out.println(solve(strings));
    }

    public static long solve(String[] strings) {
        int[][] child = new int[max][26];
        boolean[] isWord = new boolean[max];
        int length = strings.length;
        int[][] paths = new int[length][];
        int nxt = 1;
        for (int k = 0; k < length; k++) {
            String s = strings[k];
            int n = s.length();
            int[] path = new int[n];
            int node = 0;
            for (int i = n - 1, j = 0; i >= 0; i--, j++) {
                int c = s.charAt(i) - 'a';
                path[j] = node;
                if (child[node][c] == 0) child[node][c] = nxt++;
                node = child[node][c];
            }
            paths[k] = path;
            isWord[node] = true;
        }
        long ans = 0;
        for (int k = 0; k < length; k++) {
            String s = strings[k];
            int n = s.length();
            int[] path = paths[k];
            Set<Integer> set = new HashSet<>();
            for (int i = 0, j = n - 1; j >= 0; i++, j--) {
                set.add(s.charAt(i) - 'a');
                int node = path[j];
                for (Integer c : set) {
                    if (isWord[child[node][c]]) ans++;
                }
            }
        }
        return ans - length;
    }
}