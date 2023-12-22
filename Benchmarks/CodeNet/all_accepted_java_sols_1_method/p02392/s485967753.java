import java.util.Scanner;

public class Main
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        String aa = sc.next();
        String bb = sc.next();
        String cc = sc.next();

        int a = Integer.parseInt(aa);
        int b = Integer.parseInt(bb);
        int c = Integer.parseInt(cc);

        if ((a < b) && (b < c))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

}
