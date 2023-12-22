import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner cin= new Scanner(System.in);
		int n=cin.nextInt();
		int k=n%10;
		if(k==2||k==4||k==5||k==7||k==9)
		{
			System.out.println("hon");
		}
		else
		{
			if(k==0||k==1||k==6||k==8)
			{
				System.out.println("pon");	
			}
			else
			{
				System.out.println("bon");
			}
		}
	}

}
