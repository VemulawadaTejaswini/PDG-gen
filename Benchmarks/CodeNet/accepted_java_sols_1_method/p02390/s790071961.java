import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int c = Integer.parseInt(a);

        int num = c / 3600;

        int k = c - num*3600;

        int i = k / 60;

        int h = k-i*60;

        System.out.println(num+":"+i+":"+h);
    }

}

