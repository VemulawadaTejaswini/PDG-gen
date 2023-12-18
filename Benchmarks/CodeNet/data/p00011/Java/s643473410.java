import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in).useDelimiter("[,\\n]");
		
		int w = sc.nextInt();
		int lines[] = new int[w];
		for (int i = 0; i < w; i++)
		{
			lines[i] = i;
		}
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			int tmp = lines[a];
			lines[a] = lines[b];
			lines[b] = tmp;
		}
		for (int i = 0; i < w; i++)
		{
			System.out.println(Integer.toString(lines[i] + 1));
		}
	}
}