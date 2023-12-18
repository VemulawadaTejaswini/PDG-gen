import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        PrintWriter out=new PrintWriter(System.out);
        Scanner ir=new Scanner(System.in);
        for(;;){
            int n=ir.nextInt();
            long m=ir.nextLong();
            long k=ir.nextLong();
            if(n==0&&m==0&&k==0){
                break;
            }
            long[] pos=new long[n+1];
            pos[n]=m;
            for(int i=n-1;i>=0;i--){
                if(pos[i+1]<=1L<<i){
                    pos[i]=(1L<<i)+1-pos[i+1];
                }
                else{
                    pos[i]=pos[i+1]-(1L<<i);
                }
            }
            StringBuilder sb=new StringBuilder();
            long cur=k;
            for(int i=0;i<n;i++){
                if(cur<=1L<<(n-i-1)){
                    if(pos[i+1]<=1L<<i){
                        cur=calcleft(cur, i+1, n);
                        sb.append("L");
                    }
                    else{
                        cur=calcright(cur, i+1, n);
                        sb.append("R");
                    }
                }
                else{
                    if(pos[i+1]<=1L<<i){
                        cur=calcright(cur, i+1, n);
                        sb.append("R");
                    }
                    else{
                        cur=calcleft(cur, i+1, n);
                        sb.append("L");
                    }
                }
                //out.println(cur+" "+i+" "+pos[i]);
            }
            out.println(sb);
        }
        out.flush();
    }

    static long calcleft(long cur, int t,int n){
        if(cur>1L<<(n-t)){
            return cur-(1L<<(n-t));
        }
        return (1L<<(n-t))+1-cur;
    }

    static long calcright(long cur, int t,int n){
        if(cur<=1L<<(n-t)){
            return cur;
        }
        return (1L<<(n-t+1))-cur+1;
    }
}
