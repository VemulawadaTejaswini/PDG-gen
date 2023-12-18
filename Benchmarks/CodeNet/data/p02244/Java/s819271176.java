import java.util.*;

public class Main {
    
    static int[][] q = new int[8][8];
    static int cnt;
    
    static void mark(int a, int b){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(i == a || j == b || (i - j) == (a - b) || (i + j) == (a + b)){
                    q[i][j] = 1;
                }
            }
        }
    }
    
    static void dfs(int a){
        if(cnt == 8){
            return;
        }
        if(a == 64){
            return;
        }
        int i = a / 8;
        int j = a % 8;
        if(q[i][j] == 0){
            dfs(a + 1);
            if(cnt == 8){
                return;
            }
            mark(i, j);
            q[i][j] = 2;
            cnt++;
            dfs(a + 1);
            if(cnt == 8){
                return;
            }
            q[i][j] = 0;
            cnt--;
        }else{
            dfs(a + 1);
            if(cnt == 8){
                return;
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            mark(r, c);
            q[r][c] = 2;
        }
        cnt = k;
        dfs(0);
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(q[i][j] == 2){
                    System.out.print("Q");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

