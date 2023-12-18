import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner ir=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n=ir.nextInt();
        int m=ir.nextInt();
        long t=ir.nextLong();
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=ir.nextLong();
        }
        long res=a[0]-m;
        for(int i=0;i<n-1;i++){
            res+=Math.max(a[i+1]-a[i]-2*m,0);
        }
        res+=Math.max(t-a[n-1]-m,0);
        out.println(res);
        out.flush();
    }
}
