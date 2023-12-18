import java.io.*;
import java.util.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is;
                String[] ia;

                while(true){
                        ia = in.readLine().split("[ \t]");
                        int s = Integer.parseInt(ia[0]);
                        int d = Integer.parseInt(ia[1]);
                        if(s == 0 && d == 0){
                                break;
                        }
                        int[][] x = new int[s][d];
                        for(int i = 0;i < s; ++i){
                                ia = in.readLine().split("[ \t]");
                                for(int j = 0;j < d; ++j){
                                        x[i][j] = Integer.parseInt(ia[j]);
                                }
                        }
                        int[][] y = new int[d][d];
                        for(int i = 0;i < d-1; ++i){
                                ia = in.readLine().split("[ \t]");
                                for(int j = 0;j < d-i-1; ++j){
                                        y[i][i+j+1] = y[i+j+1][i] = Integer.parseInt(ia[j]);
                                }
                        }
                        boolean[] a = new boolean[d];
                        Arrays.fill(a,true);
                        int b = 0;
                        while(check(a)){
                                b += find_min(x,y,a);
                        }
                        System.out.println(b);
                }
        }

        static int find_min(int[][] x, int[][] y, boolean[] b){
                int next = -1;
                int c = Integer.MAX_VALUE;
                for(int i = 0;i < x.length; ++i){
                        for(int j = 0;j < x[i].length; ++j){
                                if(b[j] && 0 < x[i][j] && x[i][j] < c){
                                        c = x[i][j];
                                        next = j;
                                }
                        }
                }
                for(int i = 0;i < y.length; ++i){
                        if(!b[i]){
                                for(int j = 0;j < y[i].length; ++j){
                                        if(b[j] && 0 < y[i][j] && y[i][j] < c){
                                                c = y[i][j];
                                                next = j;
                                        }
                                }
                        }
                }
                b[next] = false;
                return c;
        }

        static boolean check(boolean[] a){
                for(int i = 0;i < a.length; ++i){
                        if(a[i]){
                                return true;
                        }
                }
                return false;
        }
}