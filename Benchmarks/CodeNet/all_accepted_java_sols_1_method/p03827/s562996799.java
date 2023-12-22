import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s = sc.next();

        int max= 0;
        String ss[]=new String[n];
        for (int i=0;i<n;++i) ss[i]=s.substring(i,i+1);

        int tmp=0;
        for (int i=0;i<n;++i)
        {
            if (ss[i].equals("I")) ++tmp;
            else if (ss[i].equals("D")) --tmp;

            if (max<tmp)
            {
                max = tmp;
            }
        }

        System.out.println(max);
    }
}