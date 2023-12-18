import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),m=sc.nextInt();
        int amin=100001;
        int[] as=new int[a];
        for(int i=0;i<a;i++){
            as[i]=sc.nextInt();
            amin=(int)Math.min(as[i],amin);
        }
        int[] bs=new int[b];
        int bmin=100001;
        for(int i=0;i<b;i++){
            bs[i]=sc.nextInt();
            bmin=(int)Math.min(bmin,bs[i]);
        }
        int mmin=200001;
        int x=0,y=0,c=0;
        for(int i=0;i<m;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            c=sc.nextInt();
            mmin=(int)Math.min(as[x-1]+bs[y-1]-c,mmin);
        }
        System.out.println((int)Math.min(amin+bmin,mmin));
    }
}