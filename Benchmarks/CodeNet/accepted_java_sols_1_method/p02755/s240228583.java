import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        int eight = key.nextInt();
        int ten = key.nextInt();
        int value = 0;
        int flag = -1;
        end:
        for(int i = 1; i<1001; i++)
        {
            double a = i*(0.08);
            if((int)a == eight)
            {
                double b = i*(0.1);
                if((int)b == ten)
                {
                    flag = 0;
                    value = i;
                    break end;
                }
            }
        }
        if(flag == 0)
            System.out.println(value);
        else
            System.out.println("-1");
    }
}