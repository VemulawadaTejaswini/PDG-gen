import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int counter = 0;
        while(a > 0 && c > 0)
        {
            if(counter % 2 == 0)
            {
                c -= b;
            }
            else
            {
                a -= d;
            }
            counter++;
        }
        if(a <= 0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}
