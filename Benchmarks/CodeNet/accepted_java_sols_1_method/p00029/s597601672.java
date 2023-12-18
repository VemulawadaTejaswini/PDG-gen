import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		String ansLongWord = "";
		int maxLen = 0;
		while(stdIn.hasNext())
		{
			String word = stdIn.next();
			if(word.equals("end"))
			{
				break;
			}
			if(maxLen < word.length())
			{
				maxLen = word.length();
				ansLongWord = word;
			}
			if(map.containsKey(word))
			{
				int c = map.get(word);
				map.put(word, c + 1);
			}
			else
			{
				map.put(word, 1);
			}
			
		}
		Iterator it = map.keySet().iterator();
		int maxCount = 0;
		String ansFreqWord = "";
		while(it.hasNext())
		{
			String s = (String)it.next();
			if(maxCount < map.get(s))
			{
				maxCount = map.get(s);
				ansFreqWord = s;
			}
		}
		System.out.println(ansFreqWord + " " + ansLongWord);
	}
}