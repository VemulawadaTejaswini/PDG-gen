import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int x, n, count;
		while(true)
		{
			x = input.nextInt();
			n = input.nextInt();
			if(x == 0  && n == 0)
				break;
			else {
				count = 0;
				for (int i = 1; i < x; i++) {
					for (int k = i+1; k <= x; k++) {
						if (n - i - k > k && n - k - i <= x) {
							count++;
						}
					}
				}
				System.out.println(count);
			}
		}
	}
}