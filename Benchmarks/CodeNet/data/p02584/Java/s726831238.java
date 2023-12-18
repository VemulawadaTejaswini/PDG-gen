import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long k=sc.nextLong();
        long d=sc.nextLong();
        long absX=Math.abs(x);
        long div=Math.min((int)Math.ceil((float)absX/(float)d),k);
        long lval=x-(div*d),rval=x+(div*d);
        k-=div;
        if(k%2==0){
            System.out.println(Math.min(Math.abs(lval),Math.abs(rval)));
        }else{
            System.out.println(Math.min(Math.abs(lval+d),Math.abs(rval-d)));
        }
    }
}