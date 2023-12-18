import java.util.*;

public class Main {

    static int n;
    static int[][] d = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n*n];
        for (int i = 0; i < n*n; i++) {
            int x = sc.nextInt();
            p[i] = x-1;
        }
        int[][] s = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(s[i], n*n);
        }
        for (int i = 0; i < n; i++) {
            s[0][i] = 0; s[n-1][i] = 0;
            s[i][0] = 0; s[i][n-1] = 0;
        }
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n-1; j++) {
                int min = n*n;
                for(int[] nd : d){
                    if(s[i+nd[0]][j+nd[1]] < min) min = s[i+nd[0]][j+nd[1]];
                }
                s[i][j] = min+1;
                for(int[] nd : d){
                    if(s[i][j]+1 < s[i+nd[0]][j+nd[1]]) s[i+nd[0]][j+nd[1]] = s[i][j]+1;
                }
            }
        }
        boolean[][] e = new boolean[n][n];
        int ans = 0;
        for (int i = 0; i < n*n; i++) {
            int r = p[i]/n;
            int c = p[i]%n;
            ans += s[r][c];
            e[r][c] = true;
            ArrayDeque<int[]> q = new ArrayDeque<>();
            q.add(new int[]{r, c});
            while(!q.isEmpty()){
                int[] nex = q.poll();
                for(int[] nd : d){
                    int nr = nex[0]+nd[0];
                    int nc = nex[1]+nd[1];
                    if(nr<0 || n-1<nr || nc<0 || n-1<nc)continue;
                    if(e[nex[0]][nex[1]]){
                        if(s[nex[0]][nex[1]] < s[nr][nc]){
                            s[nr][nc] = s[nex[0]][nex[1]];
                            q.add(new int[]{nr, nc});
                        }
                    }else{
                        if(s[nex[0]][nex[1]]+1 < s[nr][nc]){
                            s[nr][nc] = s[nex[0]][nex[1]]+1;
                            q.add(new int[]{nr, nc});
                        }
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
