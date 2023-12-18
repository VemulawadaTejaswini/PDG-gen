
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int m = Integer.parseInt(in[0]);
        int dp[]= new int[m+1];
        long sum=0;
        in = br.readLine().split(" ");
        for(int i=0;i<m-1;i++){
            dp[Integer.parseInt(in[i])]++;
        }
        for(int i=1;i<=m;i++) {
            System.out.println(dp[i]);
        }
    }
}
