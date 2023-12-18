import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

/*		int card[][] = {	{1,2,3,4,5,6,7,8,9,10,11,12,13},
							{1,2,3,4,5,6,7,8,9,10,11,12,13},
							{1,2,3,4,5,6,7,8,9,10,11,12,13},
							{1,2,3,4,5,6,7,8,9,10,11,12,13},	};*/

		boolean card[][] = new boolean[4][13];
		int n,x=0,y;
		String str;
		char ch = 0;

		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();

		for(int i=0; i<n; i++)
		{
			str = scan.next();
			y = scan.nextInt();

			switch(str)
			{
				case "S":
					x = 0;
					break;
				case "H":
					x = 1;
					break;
				case "C":
					x = 2;
					break;
				case "D":
					x = 3;
					break;

				default:
			}

			card[x][y-1] = true;
		}

		for(int i=0; i<4; i++)
		{
			for(int j=0; j<13; j++)
			{
				if(card[i][j] == false)
				{
					if(i==0) ch = 'S';
					else if(i==1) ch = 'H';
					else if(i==2) ch = 'C';
					else if(i==3) ch = 'D';

					System.out.printf("%c %d\n",ch,j+1);
				}
			}

			//System.out.println();
		}

		scan.close();
	}
}