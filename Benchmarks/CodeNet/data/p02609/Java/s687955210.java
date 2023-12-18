import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int count(BigInteger a){
        int m=0;
        while(a.compareTo(BigInteger.ZERO)!=0){
            String p=a+"";
            a=a.subtract(BigInteger.ONE);
            String q=a+"";
            a=new BigInteger(p).and(new BigInteger(q));
            m++;
        }
        return m;
    }
    public static BigInteger fasePow(int a,int n){
        if(n==1) return BigInteger.valueOf(a);
        BigInteger temp=fasePow(a,n/2);
        if(n%2==1)
            return temp.multiply(temp).multiply(BigInteger.valueOf(a));
        else return temp.multiply(temp);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int m=sc.nextInt();
        String n=sc.next();
        BigInteger two=new BigInteger("2");
        BigInteger q = new BigInteger(n, 2);
        int g[]=new int[200050];
        int k=0;
        char z[]=n.toCharArray();
        BigInteger v=BigInteger.ONE;
        for(int i=n.length()-1;i>=0;i--) {
            BigInteger p;
            if(z[i]=='0') {
                if(i!=n.length()-1)
                    v=v.multiply(two);
                p = q.add(v);
            }
            else {
                if(i!=n.length()-1)
                    v=v.multiply(two);
                p=q.subtract(v);
            }
            int ans = 0;
            while (p.compareTo(BigInteger.ZERO) != 0) {
                p = p.mod(BigInteger.valueOf(Main.count(p)));
                ans++;
            }
            g[k++]=ans;
        }
        for(int i=k-1;i>=0;i--)
            System.out.println(g[i]);
    }

}
