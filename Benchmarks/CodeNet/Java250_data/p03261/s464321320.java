import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	// 109-B
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String inputLine = sc.nextLine();
			int n = Integer.parseInt(inputLine);
			List<String> wordList = new ArrayList<String>(n);
			String lastWord = null;
			for(int i = 0; i < n; i++)
			{
				inputLine = sc.nextLine();
				if (lastWord != null && !inputLine.startsWith(lastWord))
				{
					System.out.println("No");
					return;
				}
				else if (wordList.indexOf(inputLine) != -1)
				{
					System.out.println("No");
					return;
				}
				else
				{
					lastWord = inputLine.substring(inputLine.length() - 1, inputLine.length());
					wordList.add(inputLine);
				}
			}
			System.out.println("Yes");

		} catch (Exception e) {
			System.out.println("Input Error");
		} finally {
			sc.close();
		}
	}
}