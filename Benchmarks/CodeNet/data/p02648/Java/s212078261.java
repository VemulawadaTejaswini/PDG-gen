import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, int[]> map = new HashMap<>();

        int[] v = new int[n];
        int[] w = new int[n];
        for(int i=0; i<n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int q = sc.nextInt();

        int[] root = new int[100001];
        for(int k=w[0]; k<=100000; k++) {
            root[k] = v[0];
        }
        map.put(1, root);

        for(int i=0; i<q; i++) {
            int x = sc.nextInt();
            int l = sc.nextInt();
            int y = x;
            List<Integer> list = new ArrayList<>();
            while(y > 0) {
                list.add(y);
                y /= 2;
            }
            int[] next = new int[100001];
            for(int j = list.size()-2; j>=0; j--) {
                int num = list.get(j);
                if(map.containsKey(num)) continue;
                int[] prev = map.get(num / 2);
                if(prev == null) {
                    prev = next;
                }
                next = new int[100001];
                for(int k = 0; k <= 100000; k++) {
                    next[k] = Math.max(next[k], prev[k]);
                    if(k + w[num-1] > 100000) continue;
                    next[k+w[num-1]] = Math.max(next[k+w[num-1]], prev[k]+v[num-1]);
                }
                if(num < 1024) {
                    map.put(num, next);
                }
            }
            System.out.println(map.get(x)[l]);
        }
    }




}