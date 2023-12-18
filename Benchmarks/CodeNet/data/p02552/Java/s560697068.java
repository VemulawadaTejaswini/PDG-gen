import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    int ans = atCoder(x);
    System.out.println(ans);
}
    public static int atCoder(int x)
    {
        if (x == 0)
        {
            return 1;
        }
        else if (x == 1) {
            return 0;
        }
        return x;
    }

}
