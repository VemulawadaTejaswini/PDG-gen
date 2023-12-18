import java.util.*;

class Main {
    static Scanner sc = new Scanner(System.in);
    static int w,h;
    static char[][] map;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = { 0,-1, 1, 0}; 
    
    
    public static void main(String[] args){
        while(true){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w==0&&h==0)break;
            
            map = new char[h][w];
            
            for(int i=0;i<h;i++){
                map[i] = sc.next().toCharArray();
            }
            loop:
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(map[i][j]=='@'){
                        dfs(j,i);
                        break loop;
                    }
                }
            }
            
            int ans=0;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(map[i][j]=='*'){
                        ans++;
                    }
                }
            }
            
            System.out.println(ans);
            
        }
        
    }
    
    static void dfs(int x,int y){
        map[y][x]='*';
        for(int i=0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx>=0 && nx<w && ny>=0 && ny<h && map[ny][nx]=='.'){
                dfs(nx,ny);
            }
        }
    }
}