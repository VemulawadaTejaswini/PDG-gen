import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        
        int[][] map = new int[h+2][w+2];
        
        for(int j=0; j<w+2; j++) {
            map[0][j] = -1;
            map[h+1][j] = -1;
        }
        for(int i=1; i<h+1; i++) {
            String line = sc.next();
            String[] sp = line.split("");
            for(int j=0; j<w+2; j++) {
                if(j==0) {map[i][j] = -1; continue;}
                if(j==w+1) {map[i][j] = -1; continue;}
                if(sp[j-1].equals("#")) map[i][j] = -1;
                else map[i][j] = 0;

            }
        }
        int ans = 0;
        for(int i=1; i<h+1; i++) {
            for(int j=1; j<w+1; j++) {
                int[][] dp = new int[h+2][];
                for(int c=0; c<h+2; c++) {
                    dp[c] = map[c].clone();
                }
                if(dp[i][j] == -1) continue;
                
                dp[i][j] = 1;
                Deque<Integer> queue = new ArrayDeque<>();
                queue.add(i);
                queue.add(j);
                
                int x, y;
                while(queue.size() != 0) {
                    x = queue.poll();
                    y = queue.poll();
                    
                    if(dp[x-1][y] != -1) {
                        if(dp[x-1][y] == 0 || dp[x-1][y] > dp[x][y]+1) {
                            dp[x-1][y] = dp[x][y]+1;
                            queue.add(x-1);
                            queue.add(y);
                        }
                    }
                    if(dp[x][y+1] != -1) {
                        if(dp[x][y+1] == 0 || dp[x][y+1] > dp[x][y]+1) {
                            dp[x][y+1] = dp[x][y]+1;
                            queue.add(x);
                            queue.add(y+1);
                        }
                    }
                    if(dp[x+1][y] != -1) {
                        if(dp[x+1][y] == 0 || dp[x+1][y] > dp[x][y]+1) {
                            dp[x+1][y] = dp[x][y]+1;
                            queue.add(x+1);
                            queue.add(y);
                        }
                    }
                    if(dp[x][y-1] != -1) {
                        if(dp[x][y-1] == 0 || dp[x][y-1] > dp[x][y]+1) {
                            dp[x][y-1] = dp[x][y]+1;
                            queue.add(x);
                            queue.add(y-1);
                        }
                    }
                }
                /*
                for(int m=0; m<h+2; m++) {
                    for(int n=0; n<w+2; n++) {
                        System.out.print(dp[m][n]+"\t");
                    }
                    System.out.println();
                }
                System.out.println();
                */
                for(int m=1; m<h+1; m++) {
                    for(int n=1; n<w+1; n++) {
                        if(ans < dp[m][n]) ans = dp[m][n];
                    }
                }
            }
        }
        
        System.out.println(ans-1);
        
    }
    
}