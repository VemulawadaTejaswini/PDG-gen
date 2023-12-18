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
        System.out.println(count);
    }
}