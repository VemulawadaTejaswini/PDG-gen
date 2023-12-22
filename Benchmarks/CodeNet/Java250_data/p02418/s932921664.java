import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		char[] box = str1.toCharArray();
		String str2 = scan.next();
		char[] question = str2.toCharArray();
		int j;
		int k;
		boolean flg = false;
		
		for(int i = 0;i < box.length;i++)
		{
			if(question[0] == box[i])
			{
				j = 1;
				k = i + 1;
				if(k >= box.length){k = 0;}
				while(j < question.length && question[j] == box[k])
				{	
					j++;
					k++;
					
					if(k >= box.length){k = 0;}
				}
				if(j == question.length)
				{
					flg = true;
				}
			}
		}
		if(flg == true)
		{
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}