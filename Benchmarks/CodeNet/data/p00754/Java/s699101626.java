import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			String mes = sc.nextLine();
			if(mes.compareTo(".") == 0) break;
			int count = 0;
			boolean check = true;
			char kakko[] = new char[mes.length()];
			for(int i = 0;i < mes.length();i++)
			{
				char s = mes.charAt(i);
				if(s == '(' || s == '[')
				{
						kakko[count] = s;
						count+= 1;
				}
				else if(s == ']' || s == ')')
				{
					if(count == 0)
					{
						check = false;
						break;
					}
					char s1 = kakko[count - 1];
					if(s == ')')
					{
						//kakko[count - 1] = (Character) null;
						count -= 1;
						//System.out.println(s + ":" + s1);
						if(s1 != '(') check = false;
					}
					else
					{
						//kakko[count - 1] = (Character) null;
						count -= 1;
						//System.out.println(s + ":" + s1);
						if(s1 != '[') check = false;
					}
				}
			}
			if(count != 0) check = false;
			if(check == true) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}