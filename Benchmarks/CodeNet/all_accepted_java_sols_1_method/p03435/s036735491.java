import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c[][] = new int[3][3];
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				c[i][j] = sc.nextInt();
			}
		}
		
		boolean b1 = c[0][0] - c[0][1] == c[1][0] - c[1][1] && c[0][0] - c[0][1] == c[2][0] - c[2][1];
		boolean b2 = c[0][0] - c[0][2] == c[1][0] - c[1][2] && c[0][0] - c[0][2] == c[2][0] - c[2][2];
		boolean b3 = c[0][0] - c[1][0] == c[0][1] - c[1][1] && c[0][0] - c[1][0] == c[0][2] - c[1][2];
		boolean b4 = c[0][0] - c[2][0] == c[0][1] - c[2][1] && c[0][0] - c[2][0] == c[0][2] - c[2][2];
		
		if(b1 && b2 && b3 && b4)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}