import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int width = scan.nextInt();
		
		while(height != 0 || height != 0)
		{
			for(int i = 0;i < height;i++)
			{
				for(int j = 0;j < width;j++)
				{
					if(i % 2 == 0)
					{
						if(j % 2 == 0){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}else{
						if(j % 2 == 0){
							System.out.print(".");
						}else{
							System.out.print("#");
						}System.out.print("");
					}
				}
				System.out.println("");
			}
			System.out.println("");
			height = scan.nextInt();
			width = scan.nextInt();
		}
	}
}