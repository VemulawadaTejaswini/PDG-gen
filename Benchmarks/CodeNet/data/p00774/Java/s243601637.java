
import java.util.Scanner;


public class Main {

	static int[][] board;
	static boolean[][] delete;
	static int sum;
	static int H;

	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		while(true){


			//??\??????
			H = sc.nextInt();
			if(H == 0)
				return;

			board = new int[H][5];
			delete = new boolean[H][5];

			int sumarray[] = new int[H];

		     sum = 0;


			for(int i=0;i<H;i++)
			{
				for(int j=0;j<5;j++)
				{
					board[i][j] = sc.nextInt();
					delete[i][j] = false;
				}
			}

			//??????
			boolean flag = true;
			int count=0;

			while(flag)
			{

			fall();

			/*
				for(int i=0;i<H;i++)
				{
					for(int j=0;j<5;j++)
					{
						System.out.print(" " + board[i][j]);
						delete[i][j] = false;
					}
					System.out.println();
				}

				System.out.println();

*/
				del();

				int x=0;
				int y=0;
				boolean fl = true;

				for(x=0;x<H;x++)
				{
					for(y=0;y<5;y++)
					{
					   if(delete[x][y]){
						   fl = false;
					//	   System.out.println("haitta");
						   break;
					   }
					}

				}

				if(fl)
				{
					//System.out.println("????????????");
					flag = false;
				}
		}

			System.out.println(sum);


		}//while??????

		}//main?????????


	public static boolean fall()
	{

		for(int j=0;j<5;j++)
		{
			int count = 0;
			for(int i=H-1;i>=0;i--)
			{
				
				if(delete[i][j] == true )
				{
					count = count(i,j,count);
					delete[i][j] = false;
				}
				if(i -count >0 && delete[i-count][j])
				{
					delete[i-count][j] = false;
					count = count(i-count,j,count);

				}

				if(i-count < 0)
					board[i][j] = 0;
				else
					board[i][j] = board[i-count][j];
			}
		}
		return true;

	}

	public static int count(int i,int j,int count){


		count++;
		if(i > 0&&  delete[i-1][j] == true)
			return count(i-1,j,count);
		else
			return count;

	}

	public static void del()
	{

		for(int i=0;i<H;i++)
		{
			int num = board[i][0];
			int count = 1;

			for(int j=1;j<5;j++)
			{
				if(board[i][j] == num && num !=0)
				{
					count++;

					if(j == 4 && count >= 3)
					{
						//?????£??¨?????????????????????
						sum += count * num;
						for(int k=0;k<count;k++)
						{
							delete[i][j-k] = true;
						}
					}
				}
				else
				{
					if(count >= 3)
					{
						//?????£??¨?????????????????????
						sum += count * num;
						for(int k=1;k<=count;k++)
						{
							delete[i][j-k] = true;
						}
					}
					num = board[i][j];
					count = 1;
				}

			}

		}//??????????????????



	}


}