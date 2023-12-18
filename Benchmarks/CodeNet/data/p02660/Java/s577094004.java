
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        int sqrt = (int)Math.sqrt(N);
        int[] primeFactors = new int[sqrt+2];

        for (int i=2; i<=sqrt+1; i++){
            while(N%i==0){
                primeFactors[i]++;
                N/=i;
            }
        }
        int ans=0;

        for (int i=2; i<=sqrt+1; i++){
            int cur=primeFactors[i];
            for (int k=1; k<=cur; k++){
                cur-=k;
                ans++;
            }

        }
        if (ans==0 && N!=1)
            ans++;
        System.out.println(ans);



    }



}
