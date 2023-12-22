//package Div2_655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());
        int t=Integer.parseInt(st.nextToken());
        int ans=n/x;
        if(n%x!=0){
            ans++;
        }
        ans*=t;
        System.out.println(ans);
    }
}
