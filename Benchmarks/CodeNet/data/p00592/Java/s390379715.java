import java.io.*;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is; 
                String ia[];
                while(true){
                        ia = in.readLine().split(" ");
                        int a, b, c;
                        a = Integer.parseInt(ia[0]);
                        b = Integer.parseInt(ia[1]);
                        c = Integer.parseInt(ia[2]);
                        if(a == 0 && b == 0 && c == 0){ 
                                break;
                        }   
                        int cm[][][] = new int[a][][];
                        for(int i = 0;i < a; ++i){
                                int d = Integer.parseInt(in.readLine());
                                cm[i] = new int[2][d];
                                ia = in.readLine().split(" ");
                                for(int j = 0;j < d; ++j){
                                        cm[i][0][j] = Integer.parseInt(ia[2*j]);
                                        cm[i][1][j] = Integer.parseInt(ia[2*j+1]);
                                }   
                        }

                        int max = 0, t = 0;
                        for(int i = b;i < c;){
                                boolean x[] = new boolean[a];
                                Arrays.fill(x,true);
                                for(int j = 0;j < a; ++j){
                                        for(int k = 0;k < cm[j][0].length; ++k){
                                                if(cm[j][0][k] <= i && i < cm[j][1][k]){
                                                        x[j] = false;
                                                }
                                        }
                                }
                                boolean y = false;
                                for(int j = 0;j < a; ++j){
                                        if(x[j] == true){
                                                y = true;
                                                break;
                                        }
                                }
                                if(y){
                                        ++t;
                                } else {
                                        if(max < t){
                                                max = t;
                                        }
                                        t = 0;
                                }

                                if((++i)%100 == 60){
                                        i+=40;
                                }
                        }
                        if(max < t){
                                max = t;
                        }
                        System.out.println(max);
                }
        }
}