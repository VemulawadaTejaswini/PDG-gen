import java.util.Scanner;
class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner scan=new Scanner(System.in);
		
		int num1;
		int num2;
		int i=1;
		
		while(true)
		{
				num1=scan.nextInt();		
				num2=scan.nextInt();		
			if(num1<num2)
			{
				System.out.println(num1+" "+num2);
			}
			else if(num1>num2)
			{
				System.out.println(num2+" "+num1);
			}
			else if(num1==0&&num2==0)
			{
				System.out.println(num2+" "+num1);
				break;
			}
		}
	}

}