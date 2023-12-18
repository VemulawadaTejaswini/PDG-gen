import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        var s = new char[n][];
        for(int i = 0; i < n; i++){
            s[i] = sc.next().toCharArray();
        }
        
        int ans = 0;
        int nm = n*m;
        int y = n-1;
        int x = m-1;
        int[] dy = {0, 1};
        int[] dx = {1, 0};
        for(int i = 0; i < nm; i++){
            if(s[y][x] == 'o'){
                int[][] dist = new int[n][m];
                for(int j = 0; j < n; j++){
                    Arrays.fill(dist[j], -1);
                }
                var queue = new ArrayDeque<Pair>();
                dist[y][x] = 0;
                queue.add(new Pair(y, x));
                int max = 0;
                int maxY = y;
                int maxX = x;
                while(!queue.isEmpty()){
                    int cy = queue.peek().y;
                    int cx = queue.poll().x;
                    for(int j = 0; j < 2; j++){
                        int ny = cy + dy[j];
                        int nx = cx + dx[j];
                        if(ny >= n || nx >= m) continue;
                        if(dist[ny][nx] == -1 && s[ny][nx] != '#'){
                            dist[ny][nx] = dist[cy][cx] +1;
                            queue.add(new Pair(ny, nx));
                            if(dist[ny][nx] > max){
                                max = dist[ny][nx];
                                maxY = ny;
                                maxX = nx;
                            }
                        }
                    }
                }
                ans += max;
                s[y][x] = '.';
                s[maxY][maxX] = '#';
            }
            y++;
            x--;
            if(y == n || x == -1){
                while(y > 0 && x < m-1){
                    y--;
                    x++;
                }
                if(y >= 1){
                    y--;
                }else{
                    x--;
                }
            }
        }
        System.out.println(ans);
    }
    
    static class Pair {
        int y, x;
        
        public Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}