import java.util.Scanner;
public class Main
{
	public static void main(String aeg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			char b[][] = new char[8][8];
			for(int i=0; i<8; i++)
				b[i] = in.next().toCharArray();
			for(int i =0; i<8; i++)
			{
				for(int j=0; j<8; j++)
				{
					if(j<7&&b[i][j]=='1'&&b[i][j+1]=='1')
						if(i<7&&b[i+1][j]=='1'&&b[i+1][j+1]=='1')
							System.out.println("A");

					if(i<5&&b[i][j]=='1')
						if(b[i+1][j]=='1')
							if(b[i+2][j]=='1')
								if(b[i+3][j]=='1')
									System.out.println("B");
					
					if(j<5&&b[i][j]=='1'&&b[i][j+1]=='1'&&b[i][j+2]=='1'&&b[i][j+3]=='1')
							System.out.println("C");

					if(i<6&&b[i][j]=='1'&&b[i+1][j]=='1')
						if(j>0&&b[i+1][j-1]=='1'&&b[i+2][j-1]=='1')
							System.out.println("D");
					
					if(j<6&&b[i][j]=='1'&&b[i][j+1]=='1')
						if(i<7&&b[i+1][j+1]=='1'&&b[i+1][j+2]=='1')
							System.out.println("E");
					
					if(i<6&&b[i][j]=='1'&&b[i+1][j]=='1')
						if(j<7&&b[i+1][j+1]=='1'&&b[i+2][j+1]=='1')
							System.out.println("F");
					
					if(j<7&&b[i][j]=='1'&&b[i][j+1]=='1')
						if(j>0&&i<7&&b[i+1][j-1]=='1'&&b[i+1][j]=='1')
							System.out.println("G");
				}
			}
		}
	}
}