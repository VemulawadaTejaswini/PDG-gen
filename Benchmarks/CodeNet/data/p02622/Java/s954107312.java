import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int counter = 0;
        
        for(int i = 1;i<=s.length();i++)
        {
            if(!s.substring(i-1,i).equals(t.substring(i-1,i)))
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
