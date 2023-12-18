import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);

        List<Set<Integer>> light = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            in = br.readLine().split(" ");
            int k = Integer.parseInt(in[0]);
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < k; j++) {
                set.add(Integer.parseInt(in[j + 1]) - 1);
            }
            light.add(set);
        }
        boolean[] p = new boolean[m];
        in = br.readLine().split(" ");
        for(int i = 0; i < m; i++) {
            p[i] = Integer.parseInt(in[i]) == 1;
        }

        int ans = 0;
        for(int i = 0; i < 1 << n; i++) {
            boolean[] odd = new boolean[m];
            for(int j = 0; j < n; j++) {
                if(((i >> j) & 1) == 1) {
                    for(int k = 0; k < m; k++) {
                        if(light.get(k).contains(j)) odd[k] = !odd[k];
                    }
                }
            }
            boolean flag = true;
            for(int j = 0; j < m; j++) {
                if(odd[j] != p[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag) ans++;
        }

        System.out.println(ans);

        br.close();
    }
}