import java.awt.*;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
//给出两个数a,b 求出[a,b]中各位数字之和能整除原数的数的个数。
public class Main {
    int mod  = (int) 1e9+7;
    void solve(int[] a1, int[] a2, int k) {
        int cnt = 0;
        int n = a1.length;
        int m = a2.length;
        long tot = 0;
        int i=0;
        int j=0;
        int ans = 0;
        for(;i<n;i++){
            tot+=a1[i];
            if(tot>k){
                tot-=a1[i];
                i--;
                break;
            }else{
                cnt++;
            }
        }
        ans = Math.max(ans,cnt);
        for(int p = 0;j<m;j++){
            tot+=a2[j];
            cnt++;
            while(i>-1&&tot>k){
                tot-=a1[i];
                cnt--;
                i--;
            }
            while(i<=-1&&p<=j&&tot>k){
                tot-=a2[p];
                p++;
                cnt--;
            }
            ans = Math.max(ans,cnt);
        }

        System.out.println(ans);
    }
    //0 1 2 3 4 5 6 7
    //1 7 3 4 7 6 2 9
    //1 7 4 3 7 6 2 9;
    //1 2 1 2 1
    public static void main(String[] args)  throws IOException {
        // Use the Scanner class

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[]  s = br.readLine().split(" ");
        Main test = new Main();
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int k = Integer.parseInt(s[2]);
        int[] a1 = new int[n];
        int[] a2 = new int[m];
        s = br.readLine().split(" ");
        for(int i=0;i<n;i++){

            a1[i] = Integer.parseInt(s[i]);
        }
        s = br.readLine().split(" ");
        for(int i=0;i<m;i++){

            a2[i] = Integer.parseInt(s[i]);
        }
        test.solve(a1,a2,k);
    }
}
