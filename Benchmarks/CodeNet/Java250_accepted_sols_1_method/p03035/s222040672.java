import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int v = sc.nextInt();
        if (a <= 5)
            v = 0;
        else if (a < 13)
            v /= 2;

        System.out.println(v);
    }
}
