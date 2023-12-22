//package AtCoder_163;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringBuilder print=new StringBuilder();
        int a[]=new int[n+1];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=1;i<n;i++){
            int x=Integer.parseInt(st.nextToken());
            a[x]++;
        }
        for(int i=1;i<=n;i++){
            print.append(a[i]+"\n");
        }
        System.out.print(print.toString());
    }
}
