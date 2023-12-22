import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1=s.substring(0,4);
        String s2=s.substring(5,7);
        String s3=s.substring(8,10);
        int year=Integer.parseInt(s1);
        int month=Integer.parseInt(s2);
        int day=Integer.parseInt(s3);
        if(year>2019)
            System.out.println("TBD");
        else if(year==2019)
        {
            if(month>4)
                System.out.println("TBD");
            else
                System.out.println("Heisei");
        }
        else
            System.out.println("Heisei");
    }
}