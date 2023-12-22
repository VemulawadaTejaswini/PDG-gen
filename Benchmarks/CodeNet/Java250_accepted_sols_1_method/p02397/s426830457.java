import java.util.Scanner;

public class Main{
    public static void main(String argv[])
    {
	Scanner scan = new Scanner(System.in);
	int x,y;

	while(true)
	    {
		x = scan.nextInt();
		y = scan.nextInt();
		if( x == 0 && y == 0 )
		    break;
		else if( x <= y)
		    System.out.println(x+" "+y);
		else if( x > y )
		    System.out.println(y+" "+x);
	    }
    }
}