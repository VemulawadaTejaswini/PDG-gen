import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
        int a, b, count;
        while( input.hasNext() )
        {
            a = input.nextInt();
            b = input.nextInt();
            a += b;
            count = 0;
            while( a > 0 )
            {
                count ++;
                a /= 10;
            }
            System.out.println( count );
        }
	}
}