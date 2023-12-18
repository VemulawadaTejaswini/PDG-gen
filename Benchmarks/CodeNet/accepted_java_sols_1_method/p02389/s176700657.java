import java.util.Scanner;
 
class Main
{
    public static void main(String args[])
    {
        Scanner stdln = new Scanner(System.in);
        int a = stdln.nextInt();
        int b = stdln.nextInt();
        int c = a*b;
        int d = 2*(a+b);
        System.out.println( c + " " + d );
    }
}