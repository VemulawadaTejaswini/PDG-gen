import java.io.PrintWriter;
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        boolean[] visited = new boolean[n];
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            set.add(i);
        }


        Arrays.sort(arr);
        if (arr[0] == arr[n - 1]) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            set.remove(i);
            HashSet<Integer> removeSet = new HashSet<>();
            for (int j : set) {
                if (arr[j] % arr[i] == 0) {
                    visited[j] = true;
                    removeSet.add(j);
                }
            }
            set.removeAll(removeSet);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) ans++;
        }
        System.out.println(ans);

        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
