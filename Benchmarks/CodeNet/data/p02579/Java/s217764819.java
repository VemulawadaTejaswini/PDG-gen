import java.util.*;

public class Main {
    private static int H, W;
    private static int Sx, Sy, Ex, Ey;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        Sy = sc.nextInt()-1;
        Sx = sc.nextInt()-1;
        Ey = sc.nextInt()-1;
        Ex = sc.nextInt()-1;
        int[][] mp = new int[H][W];
        int[] group = new int[H*W];
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for(int y=0;y<H;y++){
            String line = sc.next();
            for(int x=0;x<W;x++){
                mp[y][x] = (line.charAt(x) == '.') ? 0 : 1;
                group[y*W+x] = y*W+x;
            }
        }
        //showMap(group);

        for(int y=0;y<H;y++){
            for(int x=0;x<W;x++){
                unionIfOK(group, mp, y, x, y+1, x);
                unionIfOK(group, mp, y, x, y, x+1);
                unionIfOK(group, mp, y, x, y-1, x);
                unionIfOK(group, mp, y, x, y, x-1);
            }
        }
        //showMap(group);

        for(int y=0;y<H;y++){
            for(int x=0;x<W;x++){
                if(mp[y][x] == 1){continue;}
                int s_group = my_find(group, y*W+x);
                for(int dy=y-2; dy<=y+2;dy++){
                    for(int dx=x-2;dx<=x+2;dx++){
                        if(x == dx && y == dy){
                            continue;
                        }
                        if(dy < 0 || dy >= H || dx < 0 || dx >= W){continue;}
                        if(mp[dy][dx] == 1){continue;}
                        int d_group = my_find(group, dy*W+dx);
                        if(s_group == d_group){continue;}
                        graph.putIfAbsent(s_group, new HashSet<>());
                        graph.putIfAbsent(d_group, new HashSet<>());
                        graph.get(s_group).add(d_group);
                        graph.get(d_group).add(s_group);
                    }
                }
            }
        }
        //System.out.println(graph);
        int s_group = my_find(group, Sy*W+Sx);
        int t_group = my_find(group, Ey*W+Ex);
        int ans = dfs(graph, new HashSet<>(), s_group, t_group);
        System.out.println(ans);
    }

    private static int dfs(Map<Integer, Set<Integer>> mp, Set<Integer> visited, int now, int target){
        visited.add(now);
        if(now == target){
            return 0;
        }
        for(Integer nxt: mp.get(now)){
            if(visited.contains(nxt)){continue;}
            int res = dfs(mp, visited, nxt, target);
            if(res != -1){
                return res + 1;
            }
        }
        return -1;
    }

    private static void unionIfOK(int[] group, int[][] m, int y, int x, int y2, int x2) {
        if(y2 >= 0 && y2 < H && x2 >= 0 && x2 < W){
            if(m[y][x] == 0 && m[y2][x2] == 0)
                my_union(group, y, x, y2, x2);
        }
    }

    private static void showMap(int[] m) {
        for(int y=0;y<H;y++){
            for(int x=0;x<W;x++){
                System.out.print(my_find(m, y*W+ x));
            }
            System.out.println();
        }
    }

    private static void my_union(int[] group, int y, int x, int y2, int x2) {
        int ga = my_find(group, y*W+x);
        int gb = my_find(group, y2*W+x2);
        group[ga] = gb;
    }

    private static int my_find(final int[] group,final int i) {
        List<Integer> gp = new ArrayList<>();
        int now = i;
        while(group[now] != now){
            gp.add(now);
            now = group[now];
        }
        for(int mem:gp){
            group[mem] = now;
        }
        return now;
    }

    private static void showMap(int[][] m){
        for(int y=0;y<H;y++){
            for(int x=0;x<W;x++){
                System.out.print(m[y][x]);
            }
            System.out.println();
        }
    }
}
