import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int m=in.nextInt();
			int d=in.nextInt();
			if((m|d)==0)
				return;
			if(m==1)
			{
				if(d%7==1)
					System.out.println("Thursday");
				else if(d%7==2)
					System.out.println("Friday");
				else if(d%7==3)
					System.out.println("Saturday");
				else if(d%7==4)
					System.out.println("Sunday");
				else if(d%7==5)
					System.out.println("Monday");
				else if(d%7==6)
					System.out.println("Tuesday");
				else if(d%7==0)
					System.out.println("Wednesday");
			}
			if(m==2)
			{
				if(d%7==5)
					System.out.println("Thursday");
				else if(d%7==6)
					System.out.println("Friday");
				else if(d%7==0)
					System.out.println("Saturday");
				else if(d%7==1)
					System.out.println("Sunday");
				else if(d%7==2)
					System.out.println("Monday");
				else if(d%7==3)
					System.out.println("Tuesday");
				else if(d%7==4)
					System.out.println("Wednesday");
			}
			if(m==3)
			{
				if(d%7==4)
					System.out.println("Thursday");
				else if(d%7==5)
					System.out.println("Friday");
				else if(d%7==6)
					System.out.println("Saturday");
				else if(d%7==7)
					System.out.println("Sunday");
				else if(d%7==1)
					System.out.println("Monday");
				else if(d%7==2)
					System.out.println("Tuesday");
				else if(d%7==3)
					System.out.println("Wednesday");
			}
			if(m==4)
			{
				if(d%7==1)
					System.out.println("Thursday");
				else if(d%7==2)
					System.out.println("Friday");
				else if(d%7==3)
					System.out.println("Saturday");
				else if(d%7==4)
					System.out.println("Sunday");
				else if(d%7==5)
					System.out.println("Monday");
				else if(d%7==6)
					System.out.println("Tuesday");
				else if(d%7==0)
					System.out.println("Wednesday");
			}
			if(m==5)
			{
				if(d%7==6)
					System.out.println("Thursday");
				else if(d%7==7)
					System.out.println("Friday");
				else if(d%7==1)
					System.out.println("Saturday");
				else if(d%7==2)
					System.out.println("Sunday");
				else if(d%7==3)
					System.out.println("Monday");
				else if(d%7==4)
					System.out.println("Tuesday");
				else if(d%7==5)
					System.out.println("Wednesday");
			}
			if(m==6)
			{
				if(d%7==3)
					System.out.println("Thursday");
				else if(d%7==4)
					System.out.println("Friday");
				else if(d%7==5)
					System.out.println("Saturday");
				else if(d%7==6)
					System.out.println("Sunday");
				else if(d%7==7)
					System.out.println("Monday");
				else if(d%7==1)
					System.out.println("Tuesday");
				else if(d%7==2)
					System.out.println("Wednesday");
			}
			if(m==7)
			{
				if(d%7==1)
					System.out.println("Thursday");
				else if(d%7==2)
					System.out.println("Friday");
				else if(d%7==3)
					System.out.println("Saturday");
				else if(d%7==4)
					System.out.println("Sunday");
				else if(d%7==5)
					System.out.println("Monday");
				else if(d%7==6)
					System.out.println("Tuesday");
				else if(d%7==0)
					System.out.println("Wednesday");
			}
			if(m==8)
			{
				if(d%7==5)
					System.out.println("Thursday");
				else if(d%7==6)
					System.out.println("Friday");
				else if(d%7==0)
					System.out.println("Saturday");
				else if(d%7==1)
					System.out.println("Sunday");
				else if(d%7==2)
					System.out.println("Monday");
				else if(d%7==3)
					System.out.println("Tuesday");
				else if(d%7==4)
					System.out.println("Wednesday");
			}
			if(m==9)
			{
				if(d%7==2)
					System.out.println("Thursday");
				else if(d%7==3)
					System.out.println("Friday");
				else if(d%7==4)
					System.out.println("Saturday");
				else if(d%7==5)
					System.out.println("Sunday");
				else if(d%7==6)
					System.out.println("Monday");
				else if(d%7==7)
					System.out.println("Tuesday");
				else if(d%7==1)
					System.out.println("Wednesday");
			}
			if(m==10)
			{
				if(d%7==7)
					System.out.println("Thursday");
				else if(d%7==1)
					System.out.println("Friday");
				else if(d%7==2)
					System.out.println("Saturday");
				else if(d%7==3)
					System.out.println("Sunday");
				else if(d%7==4)
					System.out.println("Monday");
				else if(d%7==5)
					System.out.println("Tuesday");
				else if(d%7==6)
					System.out.println("Wednesday");
			}
			if(m==11)
			{
				if(d%7==4)
					System.out.println("Thursday");
				else if(d%7==5)
					System.out.println("Friday");
				else if(d%7==6)
					System.out.println("Saturday");
				else if(d%7==7)
					System.out.println("Sunday");
				else if(d%7==1)
					System.out.println("Monday");
				else if(d%7==2)
					System.out.println("Tuesday");
				else if(d%7==3)
					System.out.println("Wednesday");
			}
			if(m==12)
			{
				if(d%7==2)
					System.out.println("Thursday");
				else if(d%7==3)
					System.out.println("Friday");
				else if(d%7==4)
					System.out.println("Saturday");
				else if(d%7==5)
					System.out.println("Sunday");
				else if(d%7==6)
					System.out.println("Monday");
				else if(d%7==7)
					System.out.println("Tuesday");
				else if(d%7==1)
					System.out.println("Wednesday");
			}
		}
	}
}