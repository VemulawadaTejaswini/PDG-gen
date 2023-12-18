import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int g,r;

		Scanner scan = new Scanner(System.in);

		while(true)
		{
			boolean bool=false;

			g = scan.nextInt();
			r = scan.nextInt();

			if( (g|r) == 0) break;

			for(int i=0; i<g; i++)
			{
				for(int j=0; j<r; j++)
				{
					if(!bool) System.out.print("#");
					else System.out.print(".");

					bool = !bool;
				}

				System.out.println();
			}

			System.out.println();

		}

		scan.close();

	}
}