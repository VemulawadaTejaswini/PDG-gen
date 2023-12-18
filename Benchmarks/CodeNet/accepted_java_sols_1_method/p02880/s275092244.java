import java.util.Scanner;

public class Main
{
	public static void main(String[]args)
	{
		Scanner scn = new Scanner(System.in);
		int ques = scn.nextInt();
		for(int a= 1;a<10;a++)
		{
			if((ques/a)<=9)
			{
				if(ques/a*a==ques)
				{
					System.out.println("Yes");
					break;
				}
			}
			if(a==9)
				System.out.println("No");
		}
	}
}