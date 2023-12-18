import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    int second = sc.nextInt();

	    int hour = second / (60*60);
		int minutes = (second % 3600) / 60;
		int sec = second % 60;

		System.out.printf("%d:%d:%d\n", hour, minutes, sec);

	}

}