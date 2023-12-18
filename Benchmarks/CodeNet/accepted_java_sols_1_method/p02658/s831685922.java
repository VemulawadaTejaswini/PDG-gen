import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger N=new BigInteger("1000000000000000000");
        BigInteger ans=new BigInteger("1");
        BigInteger n0=new BigInteger("0");


        int flag=1;
        int num=1;
        for(int i=1;i<=n;++i){
            BigInteger x=sc.nextBigInteger();
            if(x.compareTo(n0)==0) num=0;
            if(flag==0) continue;
            ans=ans.multiply(x);
            if(ans.compareTo(N)>0) {
                flag=0;
            }
        }

        if(num==0) System.out.println(0);
        else if(ans.compareTo(N)>0||flag==0) System.out.println("-1");
        else System.out.println(ans);
    }
}