import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> word = new ArrayList<>();
		
		ArrayList<Integer> mostCount = new ArrayList<>();
		ArrayList<String> mostWord = new ArrayList<>();
		
		for(int add_count=0; scanner.hasNext();)
		{
			String next = scanner.next();
			word.add(next);
			
			boolean is_add = false;
			for(int j=0; j<add_count; j++)
			{
				if(next.equals(mostWord.get(j)))
				{
					is_add = true;
					mostCount.set(j, mostCount.get(j)+1);
				}
			}
			if(!is_add)
			{
				add_count++;
				mostCount.add(1);
				mostWord.add(next);
			}
		}
		
		int len_max = 0;
		String str_len = "";
		for(int i=0; i<word.size(); i++)
		{
			String w = word.get(i);
			if(w.length() > len_max)
			{
				len_max = w.length();
				str_len = w;
			}
		}
		
		int word_max = 0;
		String str_most = "";
		for(int i=0; i<mostCount.size(); i++)
		{
			int cnt = mostCount.get(i);
			if(word_max < cnt)
			{
				word_max = cnt;
				str_most = mostWord.get(i);
			}
		}
		System.out.println(str_most +" "+ str_len);
	}
}