import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int a,b,c,k;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        k=sc.nextInt();
        int sum=0;
      //  int total=(a*1)+()
        for(int i=0;i<k;i++)
        {
            if(a!=0)
            {
                sum=sum+1;
                a--;
            }
            else if(b!=0)
            {
                sum+=0;
                b--;
            }
            else
            {
                sum=sum-1;
                c--;
            }
        }
        
        System.out.println(sum);
    }
}