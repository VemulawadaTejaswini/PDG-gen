import java.util.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        Scanner obj=new Scanner(System.in);
        int N,i,min,j,temp,tot=0;
        int p[],k;
        N=obj.nextInt();
        k=obj.nextInt();
        p=new int[N];
        if(N>=k)
        {
        for(i=0;i<N;i++)
            p[i]=obj.nextInt();
        for(i=0;i<N;i++)
        {
            min=i;
            for(j=i+1;j<N;j++)
            {
                if(p[j]<p[min])
                    min=j;
            }
            temp=p[i];
            p[i]=p[min];
            p[min]=temp;
        }
        for(i=0;i<k;i++)
            tot+=p[i];
        System.out.println(tot);
    }
    }
}
