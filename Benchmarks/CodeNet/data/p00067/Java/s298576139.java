import java.util.*;

public class Main {

    static int[][] m = new int[12][12];

    static void dfs(int i, int j){
        if(0 <= i && i < 12 && 0 <= j && j < 12){
            if(m[i][j] == 1){
                m[i][j] = -1;
                dfs(i + 1, j);
                dfs(i - 1, j);
                dfs(i, j + 1);
                dfs(i, j - 1);
            }
        }
    }

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
           for(int i = 0; i < 12; i++){
               String s = sc.next();
               for(int j = 0; j < 12; j++){
                   String c = s.substring(j, j + 1);
                   if(c.equals("1")) m[i][j] = 1;
                   else m[i][j] = 0;
               }
           }
           int cnt = 0;
           for(int i = 0; i < 12; i++){
               for(int j = 0; j < 12; j++){
                   if(m[i][j] == 1){
                       cnt++;
                       dfs(i, j);
                   }
               }
           }
           System.out.println(cnt);
       }
   }
}
