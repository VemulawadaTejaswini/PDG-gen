import java.util.*;
public class Main
{public static void main(String arg[]){Scanner in=new Scanner(System.in);for(;;){
            int N=in.nextInt();
            int M=in.nextInt();
            if((N|M)==0)
                return;
            int a[]=new int[101];
            for(int i=0;i<N;i++)
            {
                int m=in.nextInt();
                for(int j=0;j<m;j++)
                    a[in.nextInt()]++;
            }
            int t=0;
            for(int i=1;i<=100;i++)
                if(a[t]<a[i])
                    t=i;
            if(a[t]>=M)
                System.out.println(t);
            else
                System.out.println(0);
        }
    }
}