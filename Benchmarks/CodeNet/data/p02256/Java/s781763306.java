import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int gcd = Gcd(x, y);
        System.out.println(gcd);
    }

    public static int Gcd(int x, int y)
    {
        int i = x % y;
        if (i == 0)
        {
            return y;
        }
        else if (x >= y)
        {
            return Gcd(y, i);
        }
        else
        {
            return Gcd(y, x);
        }
    }
}

