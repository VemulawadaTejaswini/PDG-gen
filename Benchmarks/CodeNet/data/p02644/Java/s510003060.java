import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        char[][] cha = new char[h][w];
        int[][] visit = new int[h][w];
        for(int i = 0; i < h; i++){
            cha[i] = sc.next().toCharArray();
            Arrays.fill(visit[i], Integer.MAX_VALUE);
        }
        visit[r][c] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{r,c});
        //int res = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            for(int i = q.size(); i > 0; i--){
                int[] curr = q.poll();
                int count = visit[curr[0]][curr[1]];
                m: for(int m = 0; m < 4; m++){
                    for(int j = 1; ; j++){
                        int x = curr[0] + dir[m][0] * j;
                        int y = curr[1] + dir[m][1] * j;
                        if(x >= 0 && x < h &&  y >= 0 && y < w) {
                            if (cha[x][y] == '@')
                                continue m;
                            if (visit[x][y] <= count + (j - 1) / k + 1)
                                continue m;
                            q.offer(new int[]{x, y});
                            visit[x][y] = count + (j - 1) / k + 1;
                        }else
                            continue m;
                    }

                }
            }
        }
        if(visit[a][b] == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(visit[a][b]);
    }
}