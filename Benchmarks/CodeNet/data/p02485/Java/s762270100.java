import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		
		Scanner scan= new Scanner(System.in);
		while(true)
		{
			int ans = 0;
			
			String number = scan.next();
			if(number=="0")
				break;
			for(int i=0; i<number.length(); i++)
			{
				ans+=number.charAt(i)-'0';
			}
			System.out.println(ans);
			
		}
	}
}