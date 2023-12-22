import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		// TODO ©®¶¬³ê½\bhEX^u

		Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			int Size = input.length();
			String[] n =new String[30];
			///¶ñðO©çÉn[i]ÌzñÉãü
			for(int i=0;i<Size;i++)
			{
				n[i] = input.substring(i,i+1);
			}
			///¶ñðtÅoÍ
			for(int i=(Size-1);i>-1;i--)
			{
				if(i==0)
					System.out.println(n[i]);
				else
					System.out.print(n[i]);
			}
	}
}