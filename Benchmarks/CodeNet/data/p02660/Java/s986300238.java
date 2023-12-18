
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
            if (primeFactors[i]==0)
                continue;
            if (primeFactors[i]<=2){
                ans++;
                continue;
            }
            int X = primeFactors[i];
            long b=1,a=1,c=-2*X;
            int n = (int) (( -b + Math.sqrt(b^2 - 4*a*c) ) / 2*a);
            if(n*(n+1)/2==X){
                ans+=n;
            }
            else
                ans+=n-1;
        }
        if (ans==0 && N!=1)
            ans++;
        System.out.println(ans);



    }



}
