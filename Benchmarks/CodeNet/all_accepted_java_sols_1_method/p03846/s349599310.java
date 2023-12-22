import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        int[] diff = new int[n+1];
        int[] amount = new int[n+1];
        int start = 0;
        int mod = (int)1e9+7;
        for(int i=1;i<=n;i++){
            diff[in.nextInt()]+=1;
            int next = Math.abs((n-start)-start-1);
            amount[next]+=1;
            start++;
        }
        int ans = 1;
        for(int i=0;i<=n;i++){
            if (diff[i]!=amount[i]){
                out.println(0);
                out.close();
                return;
            }
            else {
                if(diff[i]>0)
                    ans*=diff[i];
                    ans%=mod;
            }


        }
        out.println(ans);
        out.close();



    }
}