import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] c=sc.next().toCharArray();
        sc.close();
        int[] f=new int[10];
        int[] b=new int[10];
        for(int i=0;i<10;i++){
            f[i]=-1;b[i]=-1;
        }
        for(int i=0;i<n;i++){
            int fn=c[i]-'0';
            int bn=c[n-i-1]-'0';
            if(f[fn]<0) f[fn]=i;
            if(b[bn]<0) b[bn]=n-i-1;
        }
        long ans=0;
        for(int i=0;i<10;i++){
            if(f[i]<0) continue;
            for(int j=0;j<10;j++){
                if(b[j]<0) continue;
                HashSet<Integer> set=new HashSet<>();
                for(int k=f[i]+1;k<b[j];k++){
                    if(set.size()==10) break;
                    set.add(c[k]-'0');
                }
                ans+=set.size();
            }
        }
        System.out.println(ans);
    }
}