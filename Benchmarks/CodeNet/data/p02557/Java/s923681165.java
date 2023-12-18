import java.util.*;

public class Main {

    static class Node {
        int x, num;
        Node (int x, int num) {
            this.x = x;
            this.num = num;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer, Integer> M = new HashMap();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            M.put(a[i], M.getOrDefault(a[i], 0) + 1);
        }
        List<Node> list = new ArrayList();
        for (Integer key : M.keySet()) {
            list.add(new Node(key, M.get(key)));
        }
        Collections.sort(list, (e1, e2) -> (e2.num - e1.num));
        int diff = list.get(0).num;
        if (diff > n / 2) System.out.println("No");
        else {
            System.out.println("Yes");
            List<Integer> aa = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).num; j++) {
                    aa.add(list.get(i).x);
                }
            }
            Map<Integer, List<Integer>> aM = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int key = aa.get(i);
                int val = aa.get((i + diff) % n);
                if (aM.containsKey(key) == false) aM.put(key, new ArrayList<Integer>());
                aM.get(key).add(val);
            }
            int[] ans = new int[n];
            M.clear();
            for (int i = 0; i < n; i++) {
                int key = a[i];
                int index = M.getOrDefault(key, 0);
                M.put(key, M.getOrDefault(key, 0) + 1);
                ans[i] = aM.get(key).get(index);
                System.out.print(ans[i]);
                System.out.print(i == n - 1 ? "\n" : " ");
            }
        }
    }
}
