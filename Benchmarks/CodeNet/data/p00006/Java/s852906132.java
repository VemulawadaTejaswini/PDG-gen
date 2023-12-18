import java.util.Scanner;
public class Main 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = "";
		for(int k=str.length()-1;k>=0;k--)
		{
			s+=str.charAt(k);
		}
		System.out.print(s);
		sc.close();
	}
}