import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {     
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = 3600;
        int c = 60;
        
        System.out.print( a / b );
        System.out.print( ":" );
        System.out.print( ( a % b ) / c );
        System.out.print( ":" );
        System.out.println( ( a % b ) % c );
        return;
}
}
