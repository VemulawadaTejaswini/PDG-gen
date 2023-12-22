
import java.io.InputStream;
import java.math.*;
import java.math.BigInteger;
import java.util.Scanner;
import java. util. Arrays;

public class Main {

    public static void main(String[] args) {
        long n,m,j,k,p,q,o,l,s,tt=1;
        int i;
        char ch;
        BigInteger an,su,u,v;
        String a,b,c;
        Scanner sc= new Scanner(System.in);
        b=sc.nextLine();
        n=Long.parseLong(b);
        a=sc.nextLine();
        k=0;
        for(i=0;i<n;)
        {
            k++;
           while(i+1<n && a.charAt(i)==a.charAt(i+1))
           {
              i++;
           }
           i++;
        }
        System.out.println(k);




    }
}
