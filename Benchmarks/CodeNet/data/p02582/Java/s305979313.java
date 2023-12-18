import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        String s =sc.next();
        s=s.toUpperCase();
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            count++;
            else
            break;
        }
        if(s.charAt(0)=='R')
        {
        count=count-1;
        if(s.charAt(1)=='R')
        count=count+1;
        }
        System.out.println(count);
    }
}