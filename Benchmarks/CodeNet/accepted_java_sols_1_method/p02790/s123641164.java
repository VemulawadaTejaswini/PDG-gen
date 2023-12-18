
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n, i, j, m, k, p, q, o, l, s, tt = 1;
        Double x,y,z;
        int ar[];
        char ch;
        BigInteger an, su, u, v;
        String a,b="",c="",d;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=0;i<n;i++)
        {
            b+=(char)(m+'0');
        }
        for(i=0;i<m;i++)
        {
            c+=(char)(n+'0');
        }
        k=0;
        for(i=0;i<n && i<m;i++)
        {
            p=b.charAt(i)-'0';
            q=c.charAt(i)-'0';
            if(p>q)
            {
                break;
            }
            else if(p<q)
            {
                k=1;
                break;
            }
        }
        if(k==0)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(b);}




    }
}

