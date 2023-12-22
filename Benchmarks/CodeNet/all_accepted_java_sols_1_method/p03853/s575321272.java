import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		
		String[] str = new String[H];
		
		for(int j = 0; j < H; j++)
			{
				str[j] = sc.next();
			}
		
		
					
		for(int i = 0; i < H; i++)
		{
			System.out.println(str[i]);
			System.out.println(str[i]);
		}
			
	}

}