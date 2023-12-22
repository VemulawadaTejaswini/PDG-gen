import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		
		int[][] value = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			value[i][0] = Integer.parseInt(sc.next());
		}
		
		for (int i = 0; i < n; i++) {
			value[i][1] = Integer.parseInt(sc.next());
		}
		
		int maxvalue = 0;
		
		for (int i = 0; i < n; i++) {
			if (value[i][0] - value[i][1] > 0) maxvalue += value[i][0] - value[i][1];
		}

		
		System.out.println(maxvalue);
		
		sc.close();
	}
	
}
