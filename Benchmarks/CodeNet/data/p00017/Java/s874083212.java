import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String in = scanner.nextLine();
	
			int shift = getShift(in);
			
			String out = "";
			for(int i=0; i<in.length(); i++)
			{
				char ch = in.charAt(i);
				if('a'<=ch && ch<='z')
				{
					out += shiftWord(ch, shift);
				}
				else {
					out += ch;
				}
			}
			System.out.println(out);
		}
	}
	
	static int getShift(String str)
	{
		String[] word = str.split(" .");
		
		for(int i=0; i<word.length; i++)
		{
			for(int j=0; j<26; j++)
			{
				String w = "";
				for(int k=0; k<word[i].length(); k++)
				{
					w += shiftWord(word[i].charAt(k), j);
				}
				if(w.indexOf("the")==0 || w.indexOf("this")==0 || w.indexOf("that")==0)
				{
					return j;
				}
			}
		}
		return 0;
	}
	
	static String shiftWord(char c, int shift)
	{
		char w = (char)(c + shift);
		if(w > 'z')
		{
			w = (char)('a' + (w - 'z')); 
		}
		return String.valueOf(w);
	}
}