import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        final long MOD = 1000000000+7;
        long n = sc.nextInt();
        long a=1; //10^n : a
        long b=1; //9^n : b
        long c=1; //8^n : c
        //=====================================
        //全通りの組み合わせ            10^n :a
        //1~9(9種)のみの組み合わせ      9^n :b
        //0,2~9(9種)のみの組み合わせ    9^n :b
        //2~9(8種)のみの組み合わせ      8^n :c
        //10種-8種-(9種-8種)-(9種-8種) : a-c-(b-c)*2 : a-2b+c
        //=====================================
        for(long i=0;i<n;i++){
            a*=10;
            b*=9;
            c*=8;
            a%=MOD;
            b%=MOD;
            c%=MOD;
        }
        if(a<0)a+=MOD;
        if(b<0)b+=MOD;
        if(c<0)c+=MOD;
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        System.out.println(a-2*b+c);
    }
}

class Monmo {
    
}
