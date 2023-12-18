import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        int t = 1;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(bu.readLine());
            int [] arr = new int[n];
            long money = 1000;
            int stocks = 0;
            String[]inp = bu.readLine().split(" ");
            for (int pos = 0; pos < n; pos++) {
                arr[pos] = Integer.parseInt(inp[pos]);
            }
            int pos = 0, valley = 0, peak = 0;
            while (pos < n-1){
                while (pos < n-1 && arr[pos]>=arr[pos+1]){
                    pos++;
                }
                valley = pos;
                while (pos < n-1 && arr[pos]<=arr[pos+1]){
                    pos++;
                }
                peak = pos;
//                System.out.println(arr[peak]+" "+arr[valley]);
                stocks = money/arr[valley];
                money -= stocks*arr[valley];
                money+=arr[peak]*stocks;
            }
            sb.append(money+"\n");
        }
        System.out.print(sb);
    }
}
