import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] field = new int[n + 1][n];
        HashSet<Integer> current = new HashSet<>();
        HashSet<Integer> next = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - 1; j++) {
                field[i][j] = sc.nextInt();
            }
            current.add(i);
        }
        int[] idxes = new int[n + 1];
        int day = 0;
        while (current.size() > 0) {
            for (int x : current) {
                if (!next.contains(x) && idxes[x] < n - 1) {
                    int play = field[x][idxes[x]];
                    if (next.contains(play)) {
                        continue;
                    }
                    if (field[play][idxes[play]] == x) {
                        idxes[x]++;
                        idxes[play]++;
                        if (idxes[x] != n - 1) {
                            next.add(x);
                        }
                        if (idxes[play] != n - 1) {
                            next.add(play);
                        }
                    }
                }
            }
            HashSet<Integer> tmp = next;
            next = current;
            current = tmp;
            next.clear();
            day++;
        }
        for (int i = 1; i <= n; i++) {
            if (idxes[i] != n - 1) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(day);
    }
}