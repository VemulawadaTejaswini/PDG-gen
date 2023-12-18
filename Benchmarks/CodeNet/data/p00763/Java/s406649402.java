import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

@SuppressWarnings("unchecked")
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int c = sc.nextInt();
            int s = sc.nextInt()-1;
            int g = sc.nextInt()-1;
            if(n==0)break;
            long[][] dp = new long[n][(c)];
            for (int i = 0; i < dp.length; i++) {
                Arrays.fill(dp[i], 1L<<60L);
            }
            Arrays.fill(dp[s], 0);
            
            List<int[]>[]node = new List[n];
            for (int i = 0; i < node.length; i++) {
                node[i]=new LinkedList<>();
            }
            for (int i = 0; i < m; i++) {
                int x = sc.nextInt()-1;
                int y = sc.nextInt()-1;
                int d = sc.nextInt();
                int c1 = sc.nextInt()-1;
                node[x].add(new int[]{y,d,c1});
                node[y].add(new int[]{x,d,c1});
            }
            
            int[] pc = new int[c];
            for (int i = 0; i < c; i++) {
                pc[i]=sc.nextInt();
            }
            ts = new TreeMap[c];
            r=new int[c][];
            for (int i = 0; i < ts.length; i++) {
                ts[i]=new TreeMap<>();
                ts[i].put(0,new int[]{0,0});
            }
            for (int i = 0; i < pc.length; i++) {
                int[] q=new int[pc[i]-1];
                for (int j = 0; j < q.length; j++) {
                    q[j]=sc.nextInt();
                }
                Arrays.sort(q);
                r[i]=new int[pc[i]];
                for (int j = 0; j < r[i].length; j++) {
                    r[i][j]=sc.nextInt();
                }
                for (int j = 0; j < q.length; j++) {
                    Integer lower = ts[i].lowerKey(q[j]);
                    int[] preCost = ts[i].get(lower);
                    int dist = q[j]-lower;
                    int cost = preCost[1] + dist*r[i][j];
                    ts[i].put(q[j], new int[]{j+1,cost});    
                }
            }
            
            PriorityQueue<long[]>q=new PriorityQueue<>(100,new Comparator<long[]>(){
                @Override
                public int compare(long[] o1, long[] o2) {
                    return Long.compare(o1[0], o2[0]);
                }
                
            });
            q.add(new long[]{0,0,s,-1,0,0});
            long ans = -1;
            while(!q.isEmpty()){
                long cost = q.peek()[0];
                long dist = q.peek()[1];
                int cur= (int)q.peek()[2];
                int preC = (int)q.peek()[3];
                long ccost = q.peek()[4];
                int cdist = (int)q.poll()[5];
                if(cur==g){
                    ans=cost;
                    break;
                }
//                if(preC!=-1&&dp[cur][preC]<cost)continue;
//                System.out.println(cost+" "+dist+" "+cur+" "+preC);
                for(int[] next:node[cur]){
                    int nn = next[0];
                    int nd = next[1];
                    int nc = next[2];
                    if(nc==preC){
                        nd = nd + cdist;
                        long cost0 = cost(nc,nd);
                        long ncost = cost0 + cost-ccost;
                        if(dp[nn][nc] > ncost){
                            dp[nn][nc]=ncost;
//                            System.out.println("  "+ncost+" "+nd+" "+nn+" "+nc);
                            q.add(new long[]{ncost,nd,nn,nc,cost0,nd});
                        }
                    } else {
                        long cost0 = cost(nc,nd);
                        long ncost = cost0 + cost;
                        if(dp[nn][nc] > ncost){
                            dp[nn][nc]=ncost;
//                            System.out.println("  "+ncost+" "+nd+" "+nn+" "+nc);
                            q.add(new long[]{ncost,nd,nn,nc,cost0,nd});
                        }
                    }
                    
                }
            }
            System.out.println(ans);
            for (int i = 0; i < dp.length; i++) {
                for (int j = 0; j < dp[i].length; j++) {
//                    System.out.print(dp[i][j]+" ");
                }
//                System.out.println();
            }
        }

    }
    static TreeMap<Integer,int[]>[]ts;
    static int[][] r;
    static long cost(int c,int d){

        if(d==0)return 0;
        long res = 0;
        TreeMap<Integer,int[]>map = ts[c];
        Entry<Integer,int[]> e = map.lowerEntry(d);
        int lower = e.getKey();
        int[] value= map.get(lower);
        return ((long)d-lower)*r[c][value[0]]+(long)value[1];
    }
}