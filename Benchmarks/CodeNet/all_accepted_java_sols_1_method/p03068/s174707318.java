import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();

        char target = s.charAt(k - 1);

        for (char c : s.toCharArray())
        {
            if (c == target)
                System.out.print(c);
            else
                System.out.print("*");
        }
        System.out.println();
    }
}
