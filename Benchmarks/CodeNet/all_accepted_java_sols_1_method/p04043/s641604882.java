import java.util.Scanner;
public class Main {
	public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
		int input[] = new int[3];
		int key[][] = {{5,5,7},{0,0,0}};
		for(int i=0;i<3;i++)
		{
			input[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(input[i]==key[0][j] && key[1][j] != 1)
				{	key[1][j] = 1;
					break;
				}
			}
			
		}
		if((key[1][0]==1) && (key[1][1]==1) && (key[1][2]==1))
		{
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
}