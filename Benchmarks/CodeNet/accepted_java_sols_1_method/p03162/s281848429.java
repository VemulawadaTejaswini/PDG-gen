import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] dp = new int[3];
        for (int i = 0; i <N ; i++) {
            String[] lo  = reader.readLine().split(" ");
            int a = Integer.parseInt(lo[0]);
            int b = Integer.parseInt(lo[1]);
            int c = Integer.parseInt(lo[2]);
            int[] list = {a,b,c};
            int[] temp = new int[3];
            for (int j = 0; j <3 ; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = 0; k <3 ; k++) {
                    if(k!=j) max = Math.max(max,list[j]+dp[k]);
                }
                temp[j] =max;
            }
            dp =temp;
        }
        int res = Integer.MIN_VALUE;
        for (int i = 0; i <3; i++) {
            res=Math.max(res,dp[i]);
        }
        //System.out.println(Arrays.toString(dp));
        System.out.println(res);
    }
}
