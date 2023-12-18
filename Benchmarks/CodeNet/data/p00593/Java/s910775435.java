import java.io.*;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is;
                String ia[];
                int cc = 1;
                while(true){
                        int n = Integer.parseInt(in.readLine());
                        if(n == 0){
                                break;
                        }
                        int c = 1;
                        int v[][] = new int[n][n];
                        for(int i = 0;i <= 2*(n-1); ++i){
                                int j;
                                int d;
                                if(i%2 == 1){
                                        d = 1;
                                        j = 0;
                                        if(i >= n){
                                                j = i-n+1;
                                        }
                                } else {
                                        d =-1;
                                        j = i;
                                        if(i >= n){
                                                j = n-1;
                                        }
                                }
                                int e,s;
                                if(i < n){
                                        s = 0;
                                        e = i;
                                } else {
                                        s = i-n+1;
                                        e = n-1;
                                }
                                while(s <= j && j <= e){
                                        v[j][i-j] = c++;
                                        j += d;
                                }
                        }
                        System.out.println("Case " + cc + ":");
                        for(int i = 0;i < n; ++i){
                                for(int j = 0;j < n; ++j){
                                        System.out.printf("%3d",v[i][j]);
                                }
                                System.out.printf("\n");
                        }
                }
        }
}