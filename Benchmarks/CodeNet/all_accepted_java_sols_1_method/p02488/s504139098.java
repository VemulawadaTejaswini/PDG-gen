import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> word = new ArrayList<String>();
		for(int i = 0; i < n; ++i)
		{
			word.add(sc.next());
		}
		Collections.sort(word);
		System.out.println(word.get(0));
	}
}