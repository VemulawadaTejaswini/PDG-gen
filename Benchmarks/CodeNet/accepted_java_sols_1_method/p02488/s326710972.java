import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{

		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		List<String> word = new ArrayList<String>();
		for(int i=0; i<n; i++)
		{
			word.add(scan.next());
		}
		Collections.sort(word);
		String ans = word.get(0);
		System.out.println(ans);
	}
}