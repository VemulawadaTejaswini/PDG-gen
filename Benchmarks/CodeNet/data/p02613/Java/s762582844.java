import java.util.*;
class Main
{
    public static void main(String args[])
    {
        long n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        String arr[]=new String[100000];
        int ac=0,wa=0,tle=0,re=0;
        for(int i=0;i<=n;i++)
        {
            arr[i]=sc.nextLine();
            if(arr[i].equals("AC"))
            {
                ac++;
            }
            else if(arr[i].equals("WA"))
            {
                wa++;
            }
            else if(arr[i].equals("TLE"))
            {
                tle++;
            }
            else if(arr[i].equals("RE"))
            {
                re++;
            }
        }
        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);

    }
}