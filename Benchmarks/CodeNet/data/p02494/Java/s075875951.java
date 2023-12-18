import java.util.Scanner;

public class Main
{

    public static void main (String[] args)
    {
	Scanner sc = new Scanner (System.in);
	
	int h = sc.nextInt();
	int w = sc.nextInt();

	int i,j;

	for(i=0;i<h;i++)
	{
	    for(j=0;j<w;j++)
	    {
		System.out.printf("#");
	    }
	    System.out.printf("\n");
	}
    }

}