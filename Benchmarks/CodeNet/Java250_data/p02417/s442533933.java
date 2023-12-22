import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("\\n");
		String str1;
		char[] box = new char[1200];
		String str2 = "abcdefghijklmnopqrstuvwxyz";
		char[] az = str2.toCharArray();
		int[] ans = new int[26];
		
		do
		{
			str1 = scan.next();
			box = str1.toCharArray();
			
			for(int i = 0;i < box.length;i++)
			{
				if(Character.isUpperCase(box[i])){
					box[i] = Character.toLowerCase(box[i]);
				}
				
				for(int j = 0;j < 26;j++)
				{
					if(box[i] == az[j])
					{
						ans[j]++;
					}
				}
			}
		}while(scan.hasNext());
		
		for(int i = 0;i < 26;i++)
		{
			System.out.println(az[i] + " : " + ans[i]);
		}
	}
}