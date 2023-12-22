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
        m=sc.nextInt();
        sc.nextLine();
        p=0;
        q=0;
       for(i=0;i<m;i++)
       {
           a=sc.nextLine();
          o=0;
          for(j=0; ;j++)
          {
              ch=a.charAt(j);
              if(ch==' ')
              {
                  break;
              }
              o*=10;
              o+=(int)(ch-'0');
          }
          j++;
          ch=a.charAt(j);
           if(ch=='W')
           {
               if(ar[o]==0)
               {
                   br[o]++;
               }
           }
           else
           {
               if(ar[o]==0)
               {
                   p++;
                   q+=br[o];
               }
               ar[o]=1;
           }

       }
        System.out.println(p+" "+q);


    }
}

