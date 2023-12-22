import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> word = new ArrayList<>();
		
		for(; scanner.hasNext();)
		{
			word.add(scanner.next());
		}
		
		int len_max = 0;
		String str_len = "";
		int[] word_cnt = new int[word.size()];
		String[] str_words = new String[word.size()];
		for(int i=0; i<word.size(); i++)
		{
			word_cnt[i] = 0;
			str_words[i] = "";
		}
		
		for(int i=0; i<word.size(); i++)
		{
			String w = word.get(i);
			if(w.length() > len_max)
			{
				len_max = w.length();
				str_len = w;
			}
			for(int j=0; j<=i; j++)
			{
				if(w.equals(word.get(j)))
				{
					word_cnt[j] ++;
					str_words[j] = w;
				}
			}
		}
		
		String str_word = "";
		int word_max = 0;
		for(int i=0; i<word.size(); i++)
		{
			if(word_max < word_cnt[i])
			{
				word_max = word_cnt[i];
				str_word = str_words[i];
			}
		}
		
		System.out.println(str_word +" "+ str_len);
	}
}