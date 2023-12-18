import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int r,c,e=0;
	r=scan.nextInt();
	c=scan.nextInt();
	int a[][]=new int[r+1][c+1];
	int i,j;
	for(i=0;i<r;i++)
	    {
		int b=0;
		for(j=0;j<c;j++)
		    {
			a[i][j]=scan.nextInt();
			b+=a[i][j];
			
			System.out.print(a[i][j]+" ");
		    }
		a[i][j]=b;
		e+=b;
		System.out.println(a[i][j]);
	
		
	    }
	for(i=0;i<c;i++)
	    {
		int d=0;
		for(j=0;j<r;j++)
		    {
			d+=a[j][i];
				
		    }
		a[j][i]=d;
		System.out.print(a[j][i]+" ");	
	    }
	System.out.println(e);
    }
}