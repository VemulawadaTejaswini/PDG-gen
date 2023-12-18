import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] us = new int[n+1][n+1];
        int[] d = new int[n+1];
        for (int i = 0; i < n; i++) {
            int u = input.nextInt();
            int k = input.nextInt();
            while (k-- > 0) {
                int v = input.nextInt();
                us[u][v] = 1;
            }
            d[i+1] = -1;
        }
        d[1] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (d[j] == i) {
                    for (int k = 1; k <= n; k++) {
                        if (i != k && us[j][k] == 1 && d[k] == -1) {
                            d[k] = d[j]+1;
                        }
                    }
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(String.format("%d %d", i, d[i]));
        }
    }
}

class Scanner {
    BufferedReader r;
    StreamTokenizer st;
    
    public Scanner(InputStream in) {
        r = new BufferedReader(new InputStreamReader(in));
        st = new StreamTokenizer(r);
    }
    
    public String next() {
        nextToken();
        return st.sval;
    }
    
    public Integer nextInt() {
        nextToken();
        return (int)st.nval;
    }
    
    private int nextToken() {
        int token = st.TT_EOF;
        try {
            token = st.nextToken();
        } catch (IOException e) {
        }
        return token;
    }
}