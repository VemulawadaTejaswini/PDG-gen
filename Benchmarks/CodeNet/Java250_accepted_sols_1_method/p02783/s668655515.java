import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int a = s.nextInt();
        if(h%a==0)
        {
            System.out.println(h/a);
        }
        else
        {
            int k = h/a;
            k++;
            System.out.println((k)++);
        }
    }
}