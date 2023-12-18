import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
    static Scanner in;
    static PrintWriter out;
    static String INPUT = "";
     
    static void solve()
    {
        while (true){
            int n = ni();
            if(n == 0)
                break;
            int[][] a = new int[n][n];
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    a[i][j] = ni();
                }
            }
            int[][] x = new int[n][n];
             
            for(int i = 0;i < n;i++){
                int min = Integer.MAX_VALUE, minj = -1;
                for(int j = 0;j < n;j++){
                    if(min > a[i][j]){
                        min = a[i][j];
                        minj = j;
                    }
                }
                for(int j = 0;j < n;j++){
                    if(a[i][minj] == min){
                        x[i][minj] |= 1;
                    }
                }
            }
             
            for(int i = 0;i < n;i++){
                int max = -1, maxj = -1;
                for(int j = 0;j < n;j++){
                    if(max < a[j][i]){
                        max = a[j][i];
                        maxj = j;
                    }
                }
                for(int j = 0;j < n;j++){
                    if(a[j][i] == max){
                        x[j][i] |= 2;
                    }
                }
            }
             
            Set<Integer> both = new HashSet<Integer>();
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    if(x[i][j] == 3){
                        both.add(a[i][j]);
                    }
                }
            }
            if(both.size() == 1){
                StringBuilder sb = new StringBuilder();
                for(int v : both){
                    sb.append(v + " ");
                }
                sb.deleteCharAt(sb.length() - 1);
                out.println(sb);
            }else{
                out.println(0);
            }
        }
    }
     
    public static void main(String[] args) throws Exception
    {
        in = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(INPUT);
        out = new PrintWriter(System.out);
         
        solve();
        out.flush();
    }
     
    static int ni() { return Integer.parseInt(in.next()); }
    static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(o.length > 1 || o[0].getClass().isArray() ? Arrays.deepToString(o) : o[0]); }
}