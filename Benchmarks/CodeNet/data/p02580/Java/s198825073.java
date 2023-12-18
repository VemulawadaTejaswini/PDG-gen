//package Quarantine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int h=Integer.parseInt(st.nextToken());
        int w=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int a[][]=new int[h+1][w+1];
        for(int i=1;i<=m;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            a[x][y]=1;
        }
        for(int i=1;i<=h;i++){
            int count=0;
            for(int j=1;j<=w;j++){
                count+=a[i][j];
            }
            a[i][0]=count;
        }
        for(int j=1;j<=w;j++){
            int count=0;
            for(int i=1;i<=h;i++){
                count+=a[i][j];
            }
            a[0][j]=count;
        }
        int ans=0;
        for(int i=1;i<=h;i++){
            for(int j=1;j<=w;j++){
                int curr=a[0][j]+a[i][0];
                if(a[i][j]==1){
                    curr--;
                }
                ans=Math.max(ans,curr);
            }
        }
        System.out.println(ans);
    }
}
