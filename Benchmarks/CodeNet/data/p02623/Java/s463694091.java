import java.util.*;

public class Main {
    static long INF = 1000000000000000000L;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[m];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            r[i] = sc.nextInt();
        }
        
        
        // to: 隣接リスト(有向)
        
        // dist: startからの最短距離
        // ！配列ではなくmapで持つ。
        // <- 状態数が10^18もあるから。
        // <- (また、間引きできるので全状態を構える必要がないから。)
        Map<Long, Long> dist = new HashMap<Long, Long>();
        dist.put(0L, 0L);
        
        
        long record = 0;
        // ダイクストラ法: BFSで距離を配る。
        // (キューの先頭の点はそう来る他最短経路がないので最短距離が確定する)
        PriorityQueue<Point> que = new PriorityQueue<>();
        que.add(new Point(0L, 0L, -1L, -1L));
        while (!que.isEmpty()) {
            Point cur = que.poll();
            long p = cur.name;
            long dis = cur.dist;
            long left = cur.left;
            long right = cur.right;
            
            // distより大きいdisを持つ点からは配らせない
            if (dis > dist.getOrDefault(p, INF)) continue;
            
            if (dis <= k) {
                record = p;
            } else {
                break;
            }
            
            // 確定したpとdis
            // System.out.println(p + " " + dis);
            
            // 子に「自分の距離 + p→qの距離」を配る
            // 最短距離が更新される場合だけキューに入れる
            long q;
            long PtoQ;
            
            q = p + 1;
            if (left + 1 != n) {
                PtoQ = l[(int)left + 1];
                if (dis + PtoQ < dist.getOrDefault(q, INF)) {
                    dist.put(q, dis + PtoQ);
                    que.add(new Point(q, dist.get(q), left+1, right));
                }
            }
            
            q = p + 1;
            if (right + 1 != m) {
                PtoQ = r[(int)right + 1];
                if (dis + PtoQ < dist.getOrDefault(q, INF)) {
                    dist.put(q, dis + PtoQ);
                    que.add(new Point(q, dist.get(q), left, right+1));
                }
            }
        }
        System.out.println(record);
    }
}
    
class Point implements Comparable<Point> {
    long name;
    long dist;
    long left;
    long right;
     
    Point(long name, long dist, long left, long right) {
        this.name = name;
        this.dist = dist;
        this.left = left;
        this.right = right;
    }
    
    @Override
    public int compareTo(Point o) { // longでもint
        //重みの小さい順
        if (this.dist < o.dist) {
            return -1;
        } 
        return 1;
    }
}