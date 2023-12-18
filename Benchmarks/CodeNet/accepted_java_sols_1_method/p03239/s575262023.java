import java.util.Deque;
import java.util.ArrayDeque;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nt = br.readLine().split(" ");
        int n = Integer.parseInt(nt[0]);
        int t = Integer.parseInt(nt[1]);
        int[][] cts = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            String[] ct = br.readLine().split(" ");
            cts[i][0] = Integer.parseInt(ct[0]);
            cts[i][1] = Integer.parseInt(ct[1]);
        }
        
        int min = 1000;
        boolean beback = false;
        for (int i = 0; i < n; i++) {
            if (cts[i][1] <= t) {
                beback = true;
                if (cts[i][0] < min) {
                    min = cts[i][0];
                }
            }
        }
        
        if (beback) System.out.println(min);
        else System.out.println("TLE");
    }
}
