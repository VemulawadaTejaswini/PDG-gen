import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            int n = sc.nextInt();
            HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (!map.containsKey(x)) {
                    map.put(x, new HashSet<>());
                }
                map.get(x).add(y);
            }
            long[][] result = new long[a + 1][b + 1];
            result[1][1] = 1;
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    if (map.containsKey(i) && map.get(i).contains(j)) {
                        continue;
                    }
                    result[i][j] += result[i - 1][j] + result[i][j - 1];
                }
            }
            sb.append(result[a][b]).append("\n");
        }
        System.out.print(sb);
    }
}

