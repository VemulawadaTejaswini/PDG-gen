import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str = sc.nextLine().split(" ");
		StringBuilder sb = new StringBuider();
		for(int i = 0; i < n; i++)
		{
			sb.append(str[(n - 1) - i]);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}