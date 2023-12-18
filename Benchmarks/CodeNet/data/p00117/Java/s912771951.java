import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n, m, x1, x2, y1, y2;
    static int[][] edge;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }

    static boolean read(){
        if(!sc.hasNext())return false;
        n = sc.nextInt();
        m = sc.nextInt();
        edge = new int[m+1][m+1];
        for(int a[] : edge)Arrays.fill(a, 1 << 29);
        String[] input = new String[4];
        for(int i = 0; i < m; i++){
            input = sc.next().split(",");
            edge[Integer.parseInt(input[0])][Integer.parseInt(input[1])] = Integer.parseInt(input[2]);
            edge[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = Integer.parseInt(input[3]);
        }
        input = sc.next().split(",");
        x1 = Integer.parseInt(input[0]);
        x2 = Integer.parseInt(input[1]);
        y1 = Integer.parseInt(input[2]);
        y2 = Integer.parseInt(input[3]);
        return true;
    }

    static void solve(){
        for(int k = 0; k < m; k++){
            for(int i = 0; i < m; i++){
                for(int j = 0; j < m; j++){
                    edge[i][j] = Math.min(edge[i][j], edge[i][k] + edge[k][j]);
                }
            }
        }
        System.out.println(y1-y2-edge[x1][x2]-edge[x2][x1]);
    }

}