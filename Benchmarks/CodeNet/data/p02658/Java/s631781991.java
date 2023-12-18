import java.util.*;

public class Main{
    public static void main(String[] args)
    {
       

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        long  ans=1;
        for(int i=0;i<n;i++)
        {  a[i]=sc.nextInt();
        if(a[i]==0)
        {
            ans=0;
            break;

        }
           ans *=a[i];}

        if(ans<0)
            System.out.println("-1");
        else
            System.out.println(ans);



    }
}