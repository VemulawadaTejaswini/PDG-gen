
import java.util.Scanner;


public class Main {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a*b;
        int d=a+b;
        int e=a-b;
        if(c>=d && c>=e)
        {
            System.out.println(c);
        }
        else if(d>=c && d>=e)
        {
            System.out.println(d);
        }
        else
        {
            System.out.println(e);
        }
    }
}
