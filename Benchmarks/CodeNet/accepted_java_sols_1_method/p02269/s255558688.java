import java.util.Scanner;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<String>();

        int n = sc.nextInt();
        int i;

        for(i=0; i<n; i++)
        {
            String type = sc.next();

            if(type.equals("insert"))
            {
                String input = sc.next();
                hs.add(input);
            }
            else if(type.equals("find"))
            {
                String input = sc.next();
                if(hs.contains(input)) System.out.println("yes");
                else System.out.println("no");
            }
        }

        sc.close();
    }
}
