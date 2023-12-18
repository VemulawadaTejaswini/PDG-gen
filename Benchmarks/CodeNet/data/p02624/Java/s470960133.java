import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i,s=0,d,x,c;
        int N=obj.nextInt();
        for(i=1;i<=N;i++)
        {c=0;
            for(x=1;x<=i;x++)
        {
            if (i%x==0)
                c++;
        }
            s+=i*c;
        }
        System.out.println(s);
    }
    }