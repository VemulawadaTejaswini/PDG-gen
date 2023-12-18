//package Quarantine;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        int w=s.nextInt();
        int m=s.nextInt();
        int a[][]=new int[h+1][w+1];
        for(int i=1;i<=m;i++){
            int x=s.nextInt();
            int y=s.nextInt();
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
