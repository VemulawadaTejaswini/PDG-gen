import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c1[]=new int[a];
        int c2=0;
        int c3=0;
        int c4=0;
        for(int i=0;i<a;i++)
        {
            c1[i]=sc.nextInt();
        }
        Arrays.sort(c1);
        for(int i=1;i<a;i++)
        {
            c2=c2+c1[i];
        }
        for(int i=0;i<a-1;i++)
        {
            if(c1[i]==c1[i++])
                c3++;
        }
        if(c3>0)
            System.out.println(c2);
        else
            System.out.println(c2+c1[0]);
    }
}