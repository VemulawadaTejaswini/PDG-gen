import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			String str = sc.next();
			char[] str_array = new char[20];
				for(int i = 0; i < str.length(); i++)
				{
					str_array[i] = str.charAt(i);
				}
				for(int i = 0; i < str.length(); i++)
				{
					System.out.print(str_array[str.length()-i-1]);
				}
					System.out.println();
	}
}