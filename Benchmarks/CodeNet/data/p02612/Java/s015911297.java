import java.util.*;
class Main
{
    public static void main(String args[])
    {
        try
        {
            long n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextLong();
            int ac=0,wa=0,tle=0,re=0;
            for(int i=0;i<=n;i++)
            {
                String arr=sc.nextLine();
                if(arr.equals("AC"))
                {
                    ac++;
                }
                else if(arr.equals("WA"))
                {
                    wa++;
                }
                else if(arr.equals("TLE"))
                {
                    tle++;
                }
                else if(arr.equals("RE"))
                {
                    re++;
                }
            }
            System.out.println("AC x "+ac);
            System.out.println("WA x "+wa);
            System.out.println("TLE x "+tle);
            System.out.println("RE x "+re);
        }
        catch(Exception e)
        {

        }

    }
}