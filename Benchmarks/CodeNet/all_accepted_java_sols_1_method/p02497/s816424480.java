import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		
		Scanner scan= new Scanner(System.in);
		while(true)
		{
			int m = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			String g = null;
			if(m==-1 && f==-1 && r==-1)
				break;
			else if(m == -1 || f == -1)
				g="F";
			else if(m+f>=80)
				g="A";
			else if(m+f>=65)
				g="B";
			else if(m+f>=50)
				g="C";
			else if(m+f<30)
				g="F";
			else if(r>=50)
				g="C";
			else
				g="D";
			System.out.println(g);
			
		}
	}
}