import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        
        // long array[i] = (double array[i]) * 10^9;
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            str += "000000000";
            char[] c = str.toCharArray();
            
            String num = "";
            for (int j = 0; j < c.length; j++) {
                if (c[j] != '.') {
                    num += c[j];
                } else {
                    for (int k = j+1; k < j+1 + 9; k++) {
                        num += c[k];
                    }
                    break;
                }
            }
            
            array[i] = Long.parseLong(num);
        }
        // System.out.println(Arrays.toString(array));
        
        // pf[p2][p5]: 2をp2個、5をp5個、因数として持つ数の個数
        int[][] pf = new int[100][100];
        for (int i = 0; i < n; i++) {
            long num = array[i];
            int p2 = 0;
            int p5 = 0;
            
            while (num % 2 == 0) {
                p2++;
                num /= 2;
            }
            while (num % 5 == 0) {
                p5++;
                num /= 5;
            }
            
            // System.out.println(p2 + " " + p5);
            pf[p2][p5]++;
        }

        // // cumsum: 累積和
        // long[][] cumsum = new long[20+1][20+1];
        // for (int i = 1; i <= 20; i++) {
        //     for (int j = 1; j <= 20; j++) {
        //         cumsum[i][j] = pf[i-1][j-1] + cumsum[i-1][j] + cumsum[i][j-1] - cumsum[i-1][j-1];
        //     }
        // }
        // for (long[] c : cumsum) System.out.println(Arrays.toString(c));
        
        long ans = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                int p2 = i;
                int p5 = j;
                
                int need_p2 = Math.max(18 - p2, 0);
                int need_p5 = Math.max(18 - p5, 0);
                
                for (int k = need_p2; k < 100; k++) {
                    for (int l = need_p5; l < 100; l++) {
                        ans += pf[p2][p5] * pf[k][l];
                    }
                }
            }
        }
        ans /= 2;
        
        System.out.println(ans);
    }
}