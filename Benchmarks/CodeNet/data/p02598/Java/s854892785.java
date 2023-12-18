import java.util.*;

public class Main {
    static int INF = 1001001009;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        
        
        // ダイクストラ法: BFSで距離を配る。
        // (キューの先頭の点はそう来る他最短経路がないので最短距離が確定する)
        PriorityQueue<Point> que = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            que.add(new Point((double)val, 0, val));
        }
        
        while (k-- > 0) {
            Point cur = que.poll();
            double val = cur.name;
            int cnt = cur.count;
            int ori = cur.original;
            val /= 2;
            que.add(new Point(val, ++cnt, ori));
        }
        
        long min = 0;
        while (!que.isEmpty()) {
            Point cur = que.poll();
            double val = cur.name;
            int cnt = cur.count;
            cnt++;
            int ori = cur.original;
            
            // System.out.println(val + " " + cnt + " " + ori);
            
            long tmp = ((long)ori + cnt - 1) / cnt;
            
            min = Math.max(min, tmp);
        }
        System.out.println(min);
    }
}
    
class Point implements Comparable<Point> {
    double name;
    int count;
    int original;
     
    Point(double name, int count, int original) {
        this.name = name;
        this.count = count;
        this.original = original;
    }
    
    @Override
    public int compareTo(Point o) { // longでもint
        //重みの小さい順
        if (this.name > o.name) {
            return -1;
        } 
        return 1;
    }
}