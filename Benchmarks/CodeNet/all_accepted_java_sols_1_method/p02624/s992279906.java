import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        
        long ans=0;

        for (int i=1; i<=N; i++) {
            long Y = (long)Math.floor(N/i);
            ans+=(Y)*(Y+1)*i/2;
        }

        System.out.println(ans);

    }

}