import java.util.*;

 public class Main{    
     
   int INF = 1 << 28;
   boolean [][] map;
   int MAX = 21;
   int dx[]=  {-1,0,1,0};
   int dy[] = {0,-1,0,1};
   
    void run(){
       Scanner sc = new Scanner(System.in);
                        
        while(true){
            int N = sc.nextInt();
            if(N == 0){
                break;
            }
            map = new boolean[MAX][MAX];
            for(int i = 0;i < N;i++){
                map[sc.nextInt()][sc.nextInt()] = true;
            }            
            
            int M = sc.nextInt();
            int x = 10;
            int y = 10;
            int count = 0;
            
            for(int i = 0;i < M;i++){
                char c = sc.next().charAt(0);
                int  l = sc.nextInt();
                int d;             
                if(c == 'N') d = 3;
                else if(c == 'E') d = 2;
                else if(c == 'W') d = 1;
                else d = 0;
                
                for(int j = 0;j < l;j++){
                    x += dx[d];
                    y += dy[d];
                    if(map[x][y]){
                        count++;
                        map[x][y] = false;
                    }
                }
            }
                          
            System.out.println((count == N?"Yes":"No"));    
        }
    }
    
    public static void main(String args[]){
      new Main().run();    
    }
             
 }
 