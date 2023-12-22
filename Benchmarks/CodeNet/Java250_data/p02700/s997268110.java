import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        for(int i=0;i<10000000;i++)
        {
            c = c-b;
            a = a-d;
            if(c<=0)
            {
                System.out.print("Yes");
                break;
            }
            else if(a<=0)
            {
                System.out.print("No");
                break;
            }
        }


    }
}