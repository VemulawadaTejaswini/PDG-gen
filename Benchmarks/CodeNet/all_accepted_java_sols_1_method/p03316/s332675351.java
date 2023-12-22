import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        int m = n;
        while (n > 0)
        {
            int dig = n % 10;
            sum += dig;
            n /= 10;
        }
        if (m % sum == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
