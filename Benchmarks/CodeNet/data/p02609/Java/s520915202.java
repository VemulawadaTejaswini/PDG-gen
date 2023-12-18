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
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int m=sc.nextInt();
        String n=sc.next();
        BigInteger two=new BigInteger("2");
        BigInteger q = new BigInteger(n, 2);
        char z[]=n.toCharArray();
        for(int i=0;i<n.length();i++) {
            BigInteger p;
            if(z[i]=='0') {
                BigInteger v = two.pow(m - 1 - i);
                p = q.add(v);
            }
            else {
                BigInteger v=two.pow(m-1-i);
                p=q.subtract(v);
            }
            int ans = 0;
            while (p.compareTo(BigInteger.ZERO) != 0) {
                p = p.mod(BigInteger.valueOf(Main.count(p)));
                ans++;
            }
            System.out.println(ans);
        }
    }

}
