import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] hs = new int[h];
        int[] ws = new int[w];
        int x = 0;
        int y = 0;
        int[][] map = new int[h][w];
        for(int i=0; i<m; i++) {
            x = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            map[x-1][y-1]++;
            hs[x-1]++;
            ws[y-1]++;
        }
        
        int hmax = 0;
        int hmaxidx = 0;
        for(int i=0; i<h; i++) {
            if(hmax < hs[i]) {
                hmax = hs[i];
                hmaxidx = i;
                
            }
        }
        
        int count = 0;
        int max = 0;
        for(int i=0; i<w; i++) {
            count = 0;
            if(map[hmaxidx][i] > 0) {
                count = hmax + ws[i] - 1;
            }else {
                count = hmax + ws[i];
            }
            if(max < count) max = count;
        }
        System.out.println(max);
        
    }
}
