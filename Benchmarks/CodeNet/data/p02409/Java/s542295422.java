import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int n,b,c,d,e;
	n=scan.nextInt();
	int a[][][]=new int[4][3][10];
	for(int i=0;i<n;i++)
	    {
		b=scan.nextInt();
		c=scan.nextInt();
		d=scan.nextInt();
		e=scan.nextInt();
		a[b-1][c-1][d-1]=e;
	    }
	for(int i=0;i<4;i++)
	    {
		for(int j=0;j<3;j++)
		    {
			for(int k=0;k<10;k++)
			    {
				System.out.print(" "+a[i][j][k]);
			
			    }
			System.out.println();
			if(j==2 && i!=3)
			    {
				for(int l=0;l<20;l++)
				    {
					System.out.print("#");
				    }
				System.out.println();
			    }
		    }
	
	    }
    }
}