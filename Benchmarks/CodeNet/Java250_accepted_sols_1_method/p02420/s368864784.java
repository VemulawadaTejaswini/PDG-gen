import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2;
		String str3;
		
		while(!str1.equals("-"))
		{
			int[] shuffle = new int[scan.nextInt()];
			
			for(int i = 0;i < shuffle.length;i++){shuffle[i] = scan.nextInt();}
			
			for(int i = 0;i < shuffle.length;i++)
			{
				str2 = str1.substring(0,shuffle[i]);
				str3 = str1.substring(shuffle[i], str1.length());
				
				StringBuilder buf = new StringBuilder();
				buf.append(str3);
				buf.append(str2);
				str1 = buf.toString();
			}
			System.out.println(str1);
			str1 = scan.next();
		}
	}
}