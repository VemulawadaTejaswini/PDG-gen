import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            Map<String, String> map = new HashMap<String, String>();
            String first = "";
            for (int i = 0; i < n; i++) {
                String tmp[] = sc.next().replace(".", "").split(":");
                map.put(tmp[0], tmp[1]);
                if (i == 0)
                    first = tmp[0];
            }
            Set<String> set = new HashSet<String>();
            Set<String> tag = new HashSet<String>();
            Queue<String> q = new LinkedList<String>();
            q.add(first);
            while (!q.isEmpty()) {
                String str = q.poll();
                if (tag.contains(str)) {
                    continue;
                }
                tag.add(str);
                String strs[] = map.get(str).split(",");
                for (int i = 0; i < strs.length; i++) {
                    if (map.containsKey(strs[i])) {
                        if (tag.contains(strs[i]))
                            continue;
                        q.add(strs[i]);
                    } else {
                        set.add(strs[i]);
                    }
                }
            }
            System.out.println(set.size());
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}