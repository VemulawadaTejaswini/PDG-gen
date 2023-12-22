import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int last=n%10;
		
		if(last==2||last==4||last==5||last==7||last==9)
		{
			System.out.println("hon");
		}
		else if(last==0||last==1||last==6||last==8)
		{
			System.out.println("pon");
		}
		else
		{
			System.out.println("bon");
		}
		
	}
	
}