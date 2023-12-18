import java.util.Scanner;
public class Main 
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt()+sc.nextInt()+sc.nextInt()+sc.nextInt();
		System.out.println(time/60);
		System.out.println(time%60);
	}

}