import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    /*public static StreamTokenizer in;
    static {
        try{
            in = new StreamTokenizer(new BufferedReader(new InputStreamReader(new BufferedInputStream(System.in))));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int nextInt() throws IOException{ in.nextToken(); return (int)in.nval; }*/
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long ans=0;
        if(c<b)
            ans=a*c/b;
        else{
            long i=2*b-1;
            BigInteger v=new BigInteger(a+"").multiply(new BigInteger(i+""));
            //System.out.println(v);
            v=v.divide(new BigInteger(b+""));
            long q=v.longValue();
            long e=i/b;
            e*=a;
            //System.out.println(q+"  "+e);
            ans=q-e;
            }
            System.out.println(ans);
    }
}
