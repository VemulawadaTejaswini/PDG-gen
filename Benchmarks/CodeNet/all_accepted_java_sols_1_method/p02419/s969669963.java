import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String w = scanner.next();
		
		int cnt = 0;
		for(;;)
		{
			String t = scanner.next();
			if(t.equals("END_OF_TEXT"))
			{
				break;
			}
			else if(w.compareToIgnoreCase(t) == 0)
			{
				cnt++;
			}
		}
		
		System.out.println(cnt+"");
	}
}