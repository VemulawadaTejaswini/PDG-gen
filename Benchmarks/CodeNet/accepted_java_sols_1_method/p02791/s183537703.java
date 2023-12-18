import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String[] l = reader.readLine().split(" ");
        int N = Integer.parseInt(l[0]);
        String[] list = reader.readLine().split(" ");
        int[] arr = new int[N];
        for(int i= 0;i<N;i++){
            arr[i] =Integer.parseInt(list[i]);
        }
        int[] dp = new int[N];
        dp[0] = 1;
        int min = arr[0];
        for(int j = 1;j<N;j++){
            if(arr[j]<min){
                dp[j] = 1+dp[j-1];
                min = arr[j];
            }
            else{
                dp[j] = dp[j-1];
            }
        }
        System.out.println(dp[dp.length-1]);
    }

}
