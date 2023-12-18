import java.util.*;
import java.io.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] path=new int[n][m];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='#'){
                    path[i][j]=-1;
                }
            }
        }

        for(int i=1;i<m;i++){
           if(path[0][i]!=-1){
               path[0][i]=1;
           }else{
               break;
           }
        }
        for(int i=1;i<n;i++){
            if(path[i][0]!=-1){
                path[i][0]=1;
            }else{
                break;
            }
        }
        int mod=1000*1000*1000+7;

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(path[i][j]!=-1){
                    int x=path[i][j-1]==-1?0:(path[i][j-1]);
                    int y=path[i-1][j]==-1?0:(path[i-1][j]);
                    path[i][j]=((x%mod)+(y%mod))%mod;
                }
                
            }
        }
        System.out.println(path[n-1][m-1]);



    }
}