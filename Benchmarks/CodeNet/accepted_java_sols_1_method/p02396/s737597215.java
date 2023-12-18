import java.util.Scanner;
public class Main{
    public static void main(String a[])
    {
	Scanner scan = new Scanner(System.in);
	int i=1;
	int x;
	while(true)
	    {
		x = scan.nextInt();
		if( x != 0 )
		    {
			System.out.println("Case "+i+": "+x);
			i++;
		    }
		else break;
	    }
    }
}