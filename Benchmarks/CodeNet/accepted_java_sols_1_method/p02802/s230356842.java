
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<String>> result = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            String s = sc.next();

            if (!result.containsKey(p)) {
                result.put(p, new ArrayList<>());
            }
            result.get(p).add(s);
        }

        int ok = 0;
        int ng = 0;
        for (Map.Entry<Integer, List<String>> entry : result.entrySet()) {
            int acIndex = entry.getValue().indexOf("AC");
            if (acIndex == -1) {
                continue;
            }

            ok++;
            ng += acIndex;
        }

        System.out.println(ok + " " + ng);
    }

}