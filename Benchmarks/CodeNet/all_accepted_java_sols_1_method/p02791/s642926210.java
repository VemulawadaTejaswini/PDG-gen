import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n, i, j, m, k, p, q, o, l, s, tt = 1;
        Double x,y,z;
        int ar[],br[];
        char ch;
        BigInteger an, su, u, v;
        String a,b="",c="",d;
        Scanner sc = new Scanner(System.in);
        Scanner scc = new Scanner(System.in);
        ar=new int[200001];
        br=new int[200001];
        n=sc.nextInt();
        k=50000000;
       for(i=0;i<n;i++)
       {
           o=sc.nextInt();
           if(k>o)
           {
               k=o;
           }
           ar[i]=o;
           br[i]=k;
       }
       k=0;
       for(i=1;i<n;i++)
       {
           if(ar[i]<=br[i])
           {
               k++;
           }
       }
        System.out.println(k+1);


    }
}

