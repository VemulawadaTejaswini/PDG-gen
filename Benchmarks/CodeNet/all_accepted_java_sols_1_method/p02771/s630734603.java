import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a==b&&a!=c)
            System.out.println("Yes");
        else if(b==c&&a!=c)
            System.out.println("Yes");
        else if(a==c&&a!=b)
            System.out.println("Yes");
        else
            System.out.println("No");
        }
    }