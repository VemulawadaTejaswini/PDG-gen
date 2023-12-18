import java.util.*;

public class Main {
    static long INF = 1001001001001001018L;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t--> 0) {
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            
            long start = n;
            long goal = 1;
            
            // to: 隣接リスト(有向)
            
            // dist: startからの最短距離
            // 配列ではなくmapで持つ。
            // <- 状態数が10^18もあるから。
            // <- (また、間引きできるので全状態を構える必要がないから。)
            Map<Long, Long> dist = new HashMap<Long, Long>();
            dist.put(start, 0L);
            
            // ダイクストラ法: BFSで距離を配る。
            // (キューの先頭の点はそう来る他最短経路がないので最短距離が確定する)
            PriorityQueue<Point> que = new PriorityQueue<>();
            que.add(new Point(start, 0));
            while (!que.isEmpty()) {
                Point cur = que.poll();
                long p = cur.name;
                long dis = cur.dist;
                
                // System.out.println(p + " " + dis);
                
                // distより大きいdisを持つ点からは配らせない
                if (dis > dist.getOrDefault(p, INF)) continue;
                
                if (p <= 1) continue;
                
                long q;
                long PtoQ;
                
                // -1のパターン
                q = 1;
                PtoQ = dis + (p-1) * d;
                // if (PtoQ < dist.getOrDefault(q, INF)) {
                if (dis / d + (p-1) < dist.getOrDefault(q, INF) / d) {
                    dist.put(q, PtoQ);
                    que.add(new Point(q, PtoQ));
                }
                
                // /2のパターン
                if (p % 2 == 0) {
                    q = p / 2;
                    PtoQ = dis + a;
                    if (PtoQ < dist.getOrDefault(q, INF)) {
                        dist.put(q, PtoQ);
                        que.add(new Point(q, PtoQ));
                    }
                } else {
                    q = p / 2;
                    PtoQ = dis + d * (p % 2) + a;
                    if (PtoQ < dist.getOrDefault(q, INF)) {
                        dist.put(q, PtoQ);
                        que.add(new Point(q, PtoQ));
                    }
                    
                    q = (p+1) / 2;
                    PtoQ = dis + d * (2 - (p % 2)) + a;
                    if (PtoQ < dist.getOrDefault(q, INF)) {
                        dist.put(q, PtoQ);
                        que.add(new Point(q, PtoQ));
                    }
                }
                
                // /3のパターン
                if (p % 3 == 0) {
                    q = p / 3;
                    PtoQ = dis + b;
                    if (PtoQ < dist.getOrDefault(q, INF)) {
                        dist.put(q, PtoQ);
                        que.add(new Point(q, PtoQ));
                    }
                } else {
                    q = p / 3;
                    PtoQ = dis + d * (p % 3) + b;
                    if (PtoQ < dist.getOrDefault(q, INF)) {
                        dist.put(q, PtoQ);
                        que.add(new Point(q, PtoQ));
                    }
                    
                    q = (p+2) / 3;
                    PtoQ = dis + d * (3 - (p % 3)) + b;
                    if (PtoQ < dist.getOrDefault(q, INF)) {
                        dist.put(q, PtoQ);
                        que.add(new Point(q, PtoQ));
                    }
                }
                
                // /5のパターン
                if (p % 5 == 0) {
                    q = p / 5;
                    PtoQ = dis + c;
                    if (PtoQ < dist.getOrDefault(q, INF)) {
                        dist.put(q, PtoQ);
                        que.add(new Point(q, PtoQ));
                    }
                } else {
                    q = p / 5;
                    PtoQ = dis + d * (p % 5) + c;
                    if (PtoQ < dist.getOrDefault(q, INF)) {
                        dist.put(q, PtoQ);
                        que.add(new Point(q, PtoQ));
                    }
                    
                    q = (p+4) / 5;
                    PtoQ = dis + d * (5 - (p % 5)) + c;
                    if (PtoQ < dist.getOrDefault(q, INF)) {
                        dist.put(q, PtoQ);
                        que.add(new Point(q, PtoQ));
                    }
                }
            }
            System.out.println(dist.get(goal) + d);
        }
    }
}
    
class Point implements Comparable<Point> {
    long name;
    long dist;
     
    Point(long name, long dist) {
        this.name = name;
        this.dist = dist;
    }
    
    @Override
    public int compareTo(Point o) {
        //重みの小さい順
        if (this.dist < o.dist) {
            return -1;
        } 
        return 1;
    }
}