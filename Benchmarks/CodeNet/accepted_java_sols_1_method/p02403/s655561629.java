import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int H,W;
	while(true)
	    {
		H=scan.nextInt();
		W=scan.nextInt();
		if((H==0) && (W==0))break;
		for(int i=0;i<H;i++)
		    {
			
			if(H==0 && W==0)break;
			for(int j=0;j<W;j++)
			    {
				System.out.print("#");
			    }
			System.out.println();
		    }
		System.out.println();
	    }
    }
}