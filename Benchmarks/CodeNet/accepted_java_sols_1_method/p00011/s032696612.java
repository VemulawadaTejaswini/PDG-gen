import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String line1 = sc.nextLine();
        int w = Integer.parseInt(line);
        int n = Integer.parseInt(line1);
        int[][] abs = new int[n][2];
        for(int i = 0; i < n; i++) {
            String ab = sc.nextLine();
            String[] absp = ab.split(",");
            abs[i][0] = Integer.parseInt(absp[0]);
            abs[i][1] = Integer.parseInt(absp[1]);
        }
        
        int[] ans = new int[w];
        for(int i = 1; i <= w; i++) {
            int now = i;
            for(int j = 0; j < n; j++) {
                if(now == abs[j][0]) {
                    now = abs[j][1];
                }else if(now == abs[j][1]) {
                    now = abs[j][0];
                }
            }
            ans[now-1] = i;
        }
        
        for(int i = 0; i < w; i++) {
            System.out.println(ans[i]);
        }
    }
}

