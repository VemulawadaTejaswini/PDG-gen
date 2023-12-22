import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str[] = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        char mat[][] = new char[n][m];
        int start[][] = new int[n][m];
        int end[][] = new int[n][m];

        for(int i = 0; i < n; i++) {
            char c[] = br.readLine().toCharArray();
            for(int j = 0; j < m; ++j) {
                mat[i][j] = c[j];
            }
        }

        Vector<Integer>[] rows = (Vector<Integer>[]) new Vector[n];
        Vector<Integer>[] cols = (Vector<Integer>[]) new Vector[m];

        
        for(int i = 0; i < n; i++) {
            rows[i] = new Vector<Integer>();
        }

        for(int i = 0; i < m; i++) {
            cols[i] = new Vector<Integer>();
        }

        int ans = 0;

        for(int i = 0; i < n; i++) {
            rows[i].add(-1);
            for(int j = 0; j < m; j++) {
                if(mat[i][j] == '#') {
                    rows[i].add(j);
                }
            }
            rows[i].add(m);

            int l = 0, r = 1;

            for(int j = 0; j < m; j++) {
                if(mat[i][j] != '#') {
                    start[i][j] = rows[i].get(r) - rows[i].get(l);
                }
                else {
                    start[i][j] = 0;
                }
                if(j == rows[i].get(r)) {
                    l = r;
                    r += 1;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            cols[i].add(-1);
            for(int j = 0; j < n; j++) {
                if(mat[j][i] == '#') {
                    cols[i].add(j);
                }
            }
            cols[i].add(n);

            int l = 0, r = 1;
            for(int j = 0; j < n; j++) {
                if(mat[j][i] != '#') {
                    end[j][i] = cols[i].get(r) - cols[i].get(l);
                }
                else {
                    end[j][i] = 0;
                }
                if(j == cols[i].get(r))  {
                    l = r;
                    r += 1;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                ans = Math.max(ans, (start[i][j] + end[i][j]));
            }
        }

        System.out.println(ans - 3);
    }
} 