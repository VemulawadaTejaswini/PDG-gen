//第 4 問: ABC 087 B - Coins (200 点)

import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int H,W,A,B = 0;

		H = scan.nextInt();
		W = scan.nextInt();
		A = scan.nextInt();
		B = scan.nextInt();

		scan.close();

		String x = "";
		String y = "";

		int arr[] = new int[W];
		int arr2[] = new int[W];

		for(int j=0; j < W; j++)
		{
			if(j<A){
				x= x.concat("1");
				y= y.concat("0");

			}

			else
			{
				x= x.concat("0");
				y= y.concat("1");
			}
		}


		for(int i=0; i < H; i++)
		{

			if(i<B){
				System.out.println(x);
			}
			else {
				System.out.println(y);

			}
		}
	}
}

