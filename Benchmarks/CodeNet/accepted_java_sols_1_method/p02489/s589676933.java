import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		int flag = 1;
		Scanner scan= new Scanner(System.in);
		while(flag > 0)
		{
			
			int a = scan.nextInt();
			if(a==0)
			{
				break;
			}
			System.out.println("Case "+flag+": "+a);
			flag+=1;
			}
		
		}
	}