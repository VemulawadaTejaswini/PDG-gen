import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{

		Scanner scan= new Scanner(System.in);
		//???????????????????????????3?????????????????????
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int flag = 1;
		while(flag>1)
		{
			flag = -1;
			if(a>b)
			{
				int temp = a;
				a = b;
				b = temp;
				flag = 1;
			}
			if(b>c)
			{
				int temp = c;
				c = b;
				b = temp;
				
				flag = 1;
			}
		}
		System.out.println(a+" "+b+" "+c);
		
	}
}