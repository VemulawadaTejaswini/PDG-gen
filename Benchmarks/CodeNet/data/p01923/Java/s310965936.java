import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner ir=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        for(;;){
            int n=ir.nextInt();
            int m=ir.nextInt();
            if(n==0&&m==0){
                break;
            }
            int[] ma=new int[m+1];
            for(int i=0;i<n;i++){
                int d=ir.nextInt();
                int v=ir.nextInt();
                ma[d]=Math.max(ma[d],v);
            }
            long tot=0;
            for(int i=1;i<=m;i++){
                tot+=ma[i];
            }
            out.println(tot);
        }
        out.flush();
    }
}
