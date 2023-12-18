import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	static final Scanner s = new Scanner(System.in);

	public static void main(String... args)
	{
		int num = Integer.parseInt(s.nextLine());
		for(int i = 0; i < num; i++)
		{
			char[] arr = s.nextLine().toCharArray();
			Arrays.sort(arr);
			int min = Integer.parseInt(new String(arr));
			reverse(arr);
			int max = Integer.parseInt(new String(arr));
			System.out.println(max - min);
		}
	}
	
	static void reverse(char[] arr)
	{
		int l = arr.length;
		for(int i = 0; i < arr.length / 2; i++)
		{
			char tmp = arr[i];
			arr[i] = arr[l - i - 1];
			arr[l - i - 1] = tmp;
		}
	}
}