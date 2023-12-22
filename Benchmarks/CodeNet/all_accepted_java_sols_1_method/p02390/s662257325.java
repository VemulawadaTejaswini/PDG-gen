
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int S = scan.nextInt();
        int h = S / 3600;
        S = S - 3600 * h;
        int m = S / 60;
        int s = S - 60 * m;
        System.out.print(h);
        System.out.print(":");
        System.out.print(m);
        System.out.print(":");
        System.out.println(s);
    }
}

