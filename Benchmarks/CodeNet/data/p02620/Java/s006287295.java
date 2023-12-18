import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        // k: コンテストの種類数
        int k = 26;
        
        // n: 1日目～n日目にコンテストが開催される
        int n = sc.nextInt();
        
        // c[i]: タイプiのコンテストのマイナス係数
        int[] c = new int[k];
        for (int i = 0; i < k; i++) {
            c[i] = sc.nextInt();
        }
        
        // s[d][i]: タイプiをd日目に開催したときに増加する満足度
        int[][] s = new int[n+1][k];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < k; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        
        // t[i]: i日目に開かれるコンテストのタイプ
        int[] t = new int[n+1];
        for (int i = 1; i <= n; i++) {
            t[i] = sc.nextInt() - 1;
            // Random random = new Random();
            // int randomValue = random.nextInt(k);
            // t[i] = randomValue;
        }
        
        // held[i]: タイプiのコンテストの開催日の集合
        TreeSet<Integer>[] held = new TreeSet[k];
        for (int i = 0; i < k; i++) {
            held[i] = new TreeSet<Integer>();
            
            held[i].add(0);
            held[i].add(n+1);
        }
        for (int i = 1; i <= n; i++) {
            int contest = t[i];
            held[contest].add(i);
        }
        
        // 先に満足度計算をする
        long score = 0;
        for (int i = 1; i <= n; i++) {
            int contest = t[i];
            
            // UP
            score += s[i][contest];
            
            // DOWN
            for (int j = 0; j < k; j++) {
                int last = held[j].floor(i);
                score -= c[j] * (i - last);
            }
        }
        
        // m: 変更クエリ数
        int m = sc.nextInt();
        long oldscore = score;
        while(m-- > 0) {
            int d = sc.nextInt();
            int q = sc.nextInt() - 1;
            
            int old = t[d];
            
            // 一旦変える
            // 消去
            score -= s[d][old];
            
            int prev = held[old].lower(d);
            int next = held[old].higher(d);
            score -= c[old] * (next - d) * (d - prev);
            
            held[old].remove(d);
            
            // 追加
            score += s[d][q];
            
            prev = held[q].lower(d);
            next = held[q].higher(d);
            score += c[q] * (next - d) * (d - prev);
            
            held[q].add(d);
            
            t[d] = q;
            
            System.out.println(score);
        }
    }
    
    static public class Test {
        Test() {
            // System.out.println(MOD);
        }
        
    }
}
