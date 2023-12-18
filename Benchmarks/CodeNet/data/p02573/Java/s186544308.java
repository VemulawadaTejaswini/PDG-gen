import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fourth {
    static int[] parent;
    static int[] size;

    static void make_set(int v) {
        parent[v] = v;
        size[v] = 1;
    }
    static int find_set(int v) {
        if (v == parent[v])
            return v;
        return parent[v] = find_set(parent[v]);
    }
    static void union_sets(int a, int b) {
        a = find_set(a);
        b = find_set(b);
        if (a != b) {
            if (size[a] < size[b]) {
                int temp = a;
                a = b;
                b = temp;
            }
            parent[b] = a;
            size[a] += size[b];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            make_set(i);
        }

        while(m-->0){
            s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            union_sets(a-1,b-1);
        }
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, size[i]);
        }
        System.out.println(ans);
    }
}
