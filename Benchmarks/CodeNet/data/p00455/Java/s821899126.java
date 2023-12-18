import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int be =sc.nextInt()*3600+sc.nextInt()*60+sc.nextInt();
			int af =sc.nextInt()*3600+sc.nextInt()*60+sc.nextInt();
			int sum = af -be;
			System.out.println(sum/3600+" "+(sum%3600)/60+" "+sum%60);
		}
	}
}