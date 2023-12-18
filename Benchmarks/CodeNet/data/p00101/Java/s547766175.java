import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++)
		{
			String str1 = sc.nextLine();
			String str2 = str1.replaceAll("Hoshino", "Hoshina");
			System.out.println(str2);
		}
	}
}