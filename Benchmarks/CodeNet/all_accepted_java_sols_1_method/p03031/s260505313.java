import java.util.*;
import java.util.Arrays;
import java.util.BitSet;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int M = sc.nextInt();
        String[] N_M = sc.nextLine().split(" ");
        int N = Integer.valueOf(N_M[0]);
        int M = Integer.valueOf(N_M[1]);
        // System.out.println("\n\n");
        // System.out.println("N:"+N+" M:"+M);
        // System.out.println("\n\n");
        int[][] switchs = new int[M][N];
        int[] Ns = new int[N];

        for (int m = 0; m < M; m++){
            String line = sc.nextLine();
            String[] line_s = line.split(" ");
            int ki = Integer.valueOf(line_s[0]);
            for (int i = 0;i < ki; i++) {
                switchs[m][i] = Integer.valueOf(line_s[i + 1]);
            }
        }
        int[] P = new int[M];
        for (int m = 0;m < M; m++){
            P[m] = sc.nextInt();
        }

        int[] bits = new int[N];
        int light_conbination = 0;
        for (int i = 0;i<(1<<N); i++){

            int light_flg = 1;
            // for (int j = 0;j < N;j++){
                for (int m = 0; m < M; m++){
                    int cnt = 0;
                    for (int n = 0; n < N; n++){
                        if ((1 & (i >> (switchs[m][n] - 1) )) == 1){
                            cnt++;
                        }
                    }
                    if (cnt % 2 != P[m]) {
                        light_flg = 0;
                        break;
                    }
                }
                // if ((1&i>>j) == 1){
                //     cnt++;
                //     System.out.println(i+" "+j+" "+bits[j]+" "+cnt+" "+cnt%2);
                //     sb += Integer.toString(bits[j]);
                //     // System.out.println(sb);
                // }
                if (light_flg == 1){
                    light_conbination++;
                }
            // }
        }
        System.out.println(light_conbination);
    }
}
