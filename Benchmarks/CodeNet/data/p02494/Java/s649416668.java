import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

		int h,w;
		String a[][];

		Scanner sn = new Scanner(System.in);

		while(true){

			h = sn.nextInt();
			w = sn.nextInt();

			if( h == 0 && w == 0)
			{
				break;
			}

			for(int i = 0; i < h; i++)
			{
				for(int j = 0; j < w; j++)
				{
					System.out.print("#");



				}

				System.out.println("");
			}
			//System.out.println("");

		}



	}

}