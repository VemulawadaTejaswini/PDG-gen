import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken());
        long b=1,a=1,c=-2*X;
        int n = (int) (( -b + Math.sqrt(b^2 - 4*a*c) ) / 2*a);
        int ans=0;
        if(n*(n+1)/2==X){
            ans=n;
        }
        else
            ans=n+1;

        System.out.println(ans);

    }


}
