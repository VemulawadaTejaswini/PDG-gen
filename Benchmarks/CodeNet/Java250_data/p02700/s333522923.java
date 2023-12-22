import java.util.Scanner;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt(); int d = sc.nextInt(); boolean ans = false;
        for (int i = 0; i <= 100; i++) {
            if (a - d * i > 0 && c - b * (i + 1) <= 0) ans = true;
        }
        System.out.println(ans ? "Yes" : "No");
    }




}