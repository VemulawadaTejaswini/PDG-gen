import java.util.Scanner;

public class Main
{
    public static void main(String argv[])
    {
	Scanner scan = new Scanner(System.in);

	int W = scan.nextInt();
	int H = scan.nextInt();
	int x = scan.nextInt();
	int y = scan.nextInt();
	int r = scan.nextInt();
	
	if( x-r < 0 || x+r > W )
	    System.out.println("No");
	else if( y-r < 0 || y+r > H )
	System.out.println("No");
	else
	    System.out.println("Yes");
    }
}