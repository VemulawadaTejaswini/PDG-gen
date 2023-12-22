import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner key = new Scanner(System.in);
        String s = key.nextLine();
        int a = 0;
        int b = 0;

        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == 'A')
                a++;
            else
                b++;
        }

        if(a == 0 || b == 0)
        {
            System.out.println("No");
        }
        else
            System.out.println("Yes");
    }
}