

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder print=new StringBuilder();
        st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
        int maxxneg=a;
        int maxxpos=b;
        int maxypos=d;
        int maxyneg=c;
        long ans=Long.MIN_VALUE;
        if(maxxpos>0&&maxypos>0){
            ans=Math.max(ans,1l*maxxpos*maxypos);
        }
        if(maxxneg<0&&maxyneg<0){
            ans=Math.max(ans,1l*maxxneg*maxyneg);
        }
        ans=Math.max(ans,1l*a*d);
        ans=Math.max(ans,1l*b*c);
        System.out.println(ans);
    }
}
