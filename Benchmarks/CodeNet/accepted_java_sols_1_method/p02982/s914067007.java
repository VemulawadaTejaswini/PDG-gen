import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int[][] point = new int[n][d];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < d; j++) {
                point[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                double distance = 0;
                for (int k = 0; k < d; k++) {
                    int x = point[i][k] - point[j][k];
                    distance += x*x;
                }
                if (Math.sqrt(distance) == (int)Math.sqrt(distance)) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }

}
/*

 */