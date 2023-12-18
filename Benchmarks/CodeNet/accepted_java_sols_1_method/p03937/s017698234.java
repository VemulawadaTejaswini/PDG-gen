import java.util.*;

public class Main {

    static int[][] dir2 = new int[][] {  { 0, 1 }, { 1, 0 } };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] a = new char[h][w];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
        }
        boolean[][] used = new boolean[h][w];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(0);
        used[0][0] = true;
        while(!q.isEmpty()){
            int nex = q.poll();
            int ch = nex/10;
            int cw = nex%10;
            for(int[] d : dir2){
                int nh = ch + d[0];
                int nw = cw + d[1];
                if(h <= nh || w <= nw)continue;
                if(used[nh][nw] || a[nh][nw] == '.')continue;
                used[nh][nw] = true;
                q.add(10*nh + nw);
                break;
            }
        }
        boolean ans = true;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(a[i][j] == '#' && !used[i][j]){
                    ans = false;
                    break;
                }
            }
        }
        System.out.println(ans ? "Possible" : "Impossible");
        sc.close();

    }

}
