import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long ans=1;
        for (int i = 2; i<=n; i++){
            ans*=i;
            ans=ans%1000000007;
        }
        System.out.println(ans);
    }


}
